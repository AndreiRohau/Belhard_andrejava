package task_12.new_variant;

import java.util.Scanner;

/**
 * Created by Admin on 02.03.2017.
 */
public class Utill {
    private static String scanPut;
    private static String message;

    public static String scan(){
        Scanner scan = new Scanner(System.in);
        scanPut = String.valueOf((scan.nextInt()));
        return scanPut;
    }

    public static void message(String string){
        System.out.println(string);
    }
}
