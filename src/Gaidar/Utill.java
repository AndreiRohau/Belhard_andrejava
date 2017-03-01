package Gaidar;

import java.util.Scanner;

/**
 * Created by Admin on 23.02.2017.
 */
public class Utill {
    private static String scanPut;
    private static String message;
    public static String scan(){
        Scanner scan= new Scanner(System.in);
        scanPut=String.valueOf(scan.next());
    return scanPut;
    }
    public static void message(String string){
        System.out.println(string);
    }
}
