package TASKs_DONE.task_1;

//найти наименьшее общее кратное и наибольший общий делитель чисел, вводимых с консоли

import els3.logging_research.first.Someclass;

import java.util.Scanner; // импортируем класс
import java.util.logging.Logger;

public class Gcdlcm_2 { //Great Common Divisor (herein hereafter as GCD) & Least Common Multiple (hh as LCM)
    private static Logger log = Logger.getLogger(Someclass.class.getName());

    public static void gcdlcm_2() {

        log.info("Class Gcdlcm_2 is in process...");

        log.info("Enter two numbers below:");
        Scanner sc = new Scanner(System.in);            //input of two numbers
        int i1 = sc.nextInt();                          //number one
        int i2 = sc.nextInt();                          //number two
        log.info("Numbers " + i1 + ", " + i2);//show the numbers
        log.info("Least Common Multiple is " + lcm(i1, i2));
        log.info("Greatest Common Divisor is " + gcd(i1, i2));
    }

    //greatest common divisor method
    public static long gcd(long a,long b) {
        return b == 0 ? a : gcd(b,a % b);
    }

    //least common multiple method
    public static long lcm(long a,long b) {
        return a / gcd(a,b) * b;
    }

}