package task21.logging.logger.trial;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**    Добавить логгер к сделанной задаче на выбор. Продемонстрировать работу логгера
 *     private static final Logger log = Logger.getLogger(Main11.class.getName());
 */

public class Main {
    private static Logger log = Logger.getLogger("MyLog");

    public static void main(String[] args) {
        //log start
        try {
            FileHandler fh;
            // This block configure the log with handler and formatter
            fh = new FileHandler("d:\\git\\Belhard_andrejava\\myLogs\\MyLogFile.log", true);
            log.addHandler(fh);
            log.setLevel(Level.ALL);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);

        } catch (SecurityException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }
        //end

        //задаем список цифр для обработки факториала
        Scanner sc;
        ArrayList<Integer> arr = new ArrayList<>();
        int i = 0;
        int num;
        do {
            System.out.println("Enter num");
            sc = new Scanner(System.in);
            if (sc.hasNextInt()) {
                num = sc.nextInt();
                arr.add(i, num); ;
                i++;
            }else {
                break;
            }
        }while (num >= 0);

        //обрабатываем!!! факториалы заданных чисел
        for (i = 0; i < arr.size(); i++) {

            try {
                int result = Factorial.getFactorial(arr.get(i));
                log.info(String.valueOf(result));

            } catch (FactorialException ex) {
                log.warning(ex.getMessage());
                log.info(String.valueOf(ex.getNumber()));
            }
        }
    }
}
