package task16;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.logging.Logger;

/**
 * Created by rohau.andrei on 24.04.2017.
 */
public class Util {
    private static final Logger log = Logger.getLogger(Util.class.getName());

    private Map dict = new HashMap<String, String>();

    public Util() {
                                    //Map dict = new HashMap< String, String>();
        dict.put("Привет", "Hi");
        dict.put("Пока", "Bye");
        dict.put("Путешествие", "Trip");
        dict.put("Поп", "Priest");
        dict.put("Пол", "Sex");
    }

    //вводим значение ипервым дело проверяем по ключу
    //если не находит вытаскиваем все ключи и сохраняя каждый ключ проверяем его значение на совпадение,
    // если совпадение было ключ найден
    public String getterDict() {
        log.info("Введите слово для перевода: ");
        String str = scanner();

        if (dict.containsKey(str)) { //проверка наличия ключа
            str = (String) dict.get(str); // тогда вытаскивае значение по ключу

        }else if (dict.containsValue(str)) {
            Set<Map.Entry<String,Object>> dictEntry = dict.entrySet();
            for (Map.Entry<String, Object> entry : dictEntry) {
                String key = entry.getKey();
                String value = (String) entry.getValue();
                if (str.equals(value)) {
                    str = key;
                }
            }

        }else {
            log.info("Такое слово в словаре не найдено.");

        }
        return str;
    }

    public void addWords(){
        String ru, en;
        log.info("Введите русское слово: ");
        ru = scanner();
        log.info("Введите слово на английском: ");
        en = scanner();
        dict.put(ru, en);
    }

    public String scanner() {
        String scanned = "error";
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext()) {
            scanned = sc.next();
        } else if (scanned.equals("error")) {
            scanner();
        }
        return scanned;
    }

    public static void menu(Util u) {
        log.info("\n Выбери действие (введите цифру 1, 2 или 3): " +
                "\n 1. Русский - Английский - Русский. " +
                "\n 2. Добавить слово и перевод. " +
                "\n 3. Выйти из программы.");
        Scanner sc = new Scanner(System.in);
        int num;
        if (sc.hasNextInt()){
            num = sc.nextInt();
        }else {
            num = 0;
        }
        switch(num) {
            case 1:

                String n = u.getterDict();
                log.info(n);
                menu(u);
                break;

            case 2:
                u.addWords();

                menu(u);
                break;

            case 3:
                log.info("Досвидания!");
                break;

            default:
                log.info("ОШИБКА! Попробуйте ввести номер нужного пункта из списка!\n");
                menu(u);
        }
    }

}
