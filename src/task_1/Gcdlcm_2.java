package task_1;

//найти наименьшее общее кратное и наибольший общий делитель чисел, вводимых с консоли

import java.util.Scanner; // импортируем класс

public class Gcdlcm_2 { //Great Common Divisor (herein hereafter as GCD) & Least Common Multiple (hh as LCM)

    public static void gcdlcm_2() {

        System.out.println("Class Gcdlcm_2 is in process...");

        System.out.println("Enter two numbers below:");
        Scanner sc = new Scanner(System.in);            //input of two numbers
        int i1 = sc.nextInt();                          //number one
        int i2 = sc.nextInt();                          //number two
        System.out.println("Numbers " + i1 + ", " + i2);//show the numbers
        System.out.println("Least Common Multiple is " + lcm(i1, i2));
        System.out.println("Greatest Common Divisor is " + gcd(i1, i2));
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