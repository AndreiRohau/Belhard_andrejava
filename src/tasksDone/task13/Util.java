package tasksDone.task13;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Created by Admin on 02.03.2017.
 */
public class Util {
    private static final Logger log = Logger.getLogger(Util.class.getName());

    public Scanner scanPut() {
        Scanner sc = new Scanner(System.in);
        return sc;
    }

    /** пример применения - проверка на ввод int или String
    Scanner sc = Util.scanPut();
        if (sc.hasNextInt()) {
        fruit = sc.nextInt();
    } else {
        fruit = (int) (Math.random() * 10);
     }
    */

    public static void msg (String string){
        log.info(string);
    }
}
