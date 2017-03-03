package task_12;

import java.util.Scanner;

/**
 * Created by Admin on 02.03.2017.
 */
public class Utill {
    private static String scanPutString;
    private static String message;
    private static Integer scanPutInt;

    public static Scanner scan() {
        Scanner sc = new Scanner(System.in);
        Scanner n = sc;
        return n;
    }

    /** пример применения
    Scanner sc = Utill.scan();
        if (sc.hasNextInt()) {
        fruit = sc.nextInt();
    } else {
        fruit = (int) (Math.random() * 10);
    }
    */

    public static void message(String string){
        System.out.println(string);
    }
}
