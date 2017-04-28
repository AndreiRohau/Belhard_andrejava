package els3.easyLogger;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by rohau.andrei on 28.04.2017.
 */
public class LogApp {
    /**
     * Старт программы
     * @param args не используется
     */
    public static void main(String[] args)
    {
        // Получаем экземпляр класса, который будем использовать для записи логов.
        // Передаваемый параметр LogApp - имя логера.
        // В документации сказано, что имя логгера должно совпадать с именем класса или пакета ().
        Logger logger = Logger.getLogger(LogApp.class.getName());

        // Создаём handler, который будет записывать лог в файл "LogApp". Символ "%t" указывает на то, что файл
        // будет располагаться в папке с системными временными файлами.
        //адрес C:\Users\rohau.andrei\AppData\Local\Temp
        try {
            FileHandler fh = new FileHandler("%tLogApp");
            logger.addHandler(fh);

        } catch (SecurityException e) {
            logger.log(Level.SEVERE,
                    "Не удалось создать файл лога из-за политики безопасности.",
                    e);
        } catch (IOException e) {
            logger.log(Level.SEVERE,
                    "Не удалось создать файл лога из-за ошибки ввода-вывода.",
                    e);
        }

        logger.log(Level.INFO, "Запись лога с уровнем INFO (информационная)");
        logger.log(Level.WARNING,"Запись лога с уровнем WARNING (Предупреждение)");
        logger.log(Level.SEVERE, "Запись лога с уровнем SEVERE (серъёзная ошибка)");
    }
}