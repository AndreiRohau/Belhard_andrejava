package task_12;

import els3.logging_research.first.Someclass;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Created by Admin on 02.03.2017.
 */
public class Utill {
    private static final Logger log = Logger.getLogger(Someclass.class.getName());
    public static Scanner scanPut() {
        Scanner sc = new Scanner(System.in);
        return sc;
    }

    /** пример применения - проверка на ввод int или String
    Scanner sc = Utill.scanPut();
        if (sc.hasNextInt()) {
        fruit = sc.nextInt();
    } else {
        fruit = (int) (Math.random() * 10);
     }
    */

    public static void message(String string){
        log.info(string);
    }
}
