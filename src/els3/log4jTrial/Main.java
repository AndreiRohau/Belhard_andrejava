package els3.log4jTrial;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Logger;

/**    Добавить логгер к сделанной задаче на выбор. Продемонстрировать работу логгера
 *     private static final Logger log = Logger.getLogger(Main11.class.getName());
 */

public class Main {
    private static final Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

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

                log.info(ex.getMessage());
                log.info(String.valueOf(ex.getNumber()));
            }
        }
    }
}
