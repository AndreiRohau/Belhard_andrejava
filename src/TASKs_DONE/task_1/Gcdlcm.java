package TASKs_DONE.task_1;

/*найти наименьшее общее кратное и наибольший общий делитель чисел, вводимых с консоли

*/

import java.util.Scanner;

public class Gcdlcm {

    public static void gcdlcm() {

        System.out.println("Class Gcdlcm is in process...");

        Scanner sc = new Scanner(System.in);            //input of two numbers
        int i1 = sc.nextInt();                          //number one
        int i2 = sc.nextInt();                          //number two
        System.out.println("Enter two numbers below:");

//Least Common Multiple starts
        int count1 = i1;                                //needed for my calculations
        int count2 = i2;                                //needed for my calculations
        int test = 1;                                   //needed for my calculations

        if (i1 == i2) {                                 //if numbers are similar
            System.out.println("LCM " + i1);
        }

        if(i1 > i2){                                    //if first number is bigger than second one
            do{
                count2 = count2 + i2;
                test = count2%i1;
            }while(test != 0);
            System.out.println("LCM " + count2);

        }else if(i2 > i1){                              //if second number bigger than the first one
            do{
                count1 = count1 + i1;
                test = count1%i2;
            }while(test != 0);
            System.out.println("LCM is " + count1);
        }

//Greatest Common Divisor starts
        count1 = i1;                                //needed for my calculations
        count2 = i2;                                //needed for my calculations
        test = 1;                                   //needed for my calculations

        int gcd = 0;
        int mult = i1 * i2;
        if (i1 == i2) {                                 //if numbers are similar
            System.out.println("GCD is " + i1);
        }


        if(i1 > i2){                                    //if first number is bigger than second one
            do{
                count2 = count2 + i2;
                test = count2%i1;

            }while(test != 0);
            gcd = mult/count2;
            System.out.println("GCD is " + gcd);

        }else if(i2 > i1){                              //if second number bigger than the first one
            do{
                count1 = count1 + i1;
                test = count1%i2;

            }while(test != 0);
            gcd = mult/count1;
            System.out.println("GCD is " + gcd);
        }

    }

}
