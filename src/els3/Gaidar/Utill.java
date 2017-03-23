package els3.Gaidar;

import java.util.Scanner;

/**
 * Created by Admin on 23.02.2017.
 */
public class Utill {
    private static int scanPut;
    private static String message;
    public static int scan(){
        Scanner scan= new Scanner(System.in);
        scanPut=scan.nextInt();
    return scanPut;
    }
    public static void message(String string){
        System.out.println(string);
    }
}
