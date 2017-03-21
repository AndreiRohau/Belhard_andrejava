package task_13;

import java.util.Scanner;

/**
 * Created by Admin on 02.03.2017.
 */
public class Utill {

    public Scanner scanPut() {
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

    public static void msg (String string){
        System.out.println(string);
    }
}
