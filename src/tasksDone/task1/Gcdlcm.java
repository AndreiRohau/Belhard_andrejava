package tasksDone.task1;

/*найти наименьшее общее кратное и наибольший общий делитель чисел, вводимых с консоли

*/

import java.util.Scanner;
import java.util.logging.Logger;

public class Gcdlcm {

    private static Logger log = Logger.getLogger(Gcdlcm.class.getName());

    public static void gcdlcm() {

        log.info("Class Gcdlcm is in process...");

        Scanner sc = new Scanner(System.in);            //input of two numbers
        int i1 = sc.nextInt();                          //number one
        int i2 = sc.nextInt();                          //number two
        log.info("Enter two numbers below:");

//Least Common Multiple starts
        int count1 = i1;                                //needed for my calculations
        int count2 = i2;                                //needed for my calculations
        int test = 1;                                   //needed for my calculations

        if (i1 == i2) {                                 //if numbers are similar
            log.info("LCM " + i1);
        }

        if(i1 > i2){                                    //if first number is bigger than withLog4j one
            do{
                count2 = count2 + i2;
                test = count2%i1;
            }while(test != 0);
            log.info("LCM " + count2);

        }else if(i2 > i1){                              //if withLog4j number bigger than the first one
            do{
                count1 = count1 + i1;
                test = count1%i2;
            }while(test != 0);
            log.info("LCM is " + count1);
        }

//Greatest Common Divisor starts
        count1 = i1;                                //needed for my calculations
        count2 = i2;                                //needed for my calculations
        test = 1;                                   //needed for my calculations

        int gcd = 0;
        int mult = i1 * i2;
        if (i1 == i2) {                                 //if numbers are similar
            log.info("GCD is " + i1);
        }


        if(i1 > i2){                                    //if first number is bigger than withLog4j one
            do{
                count2 = count2 + i2;
                test = count2%i1;

            }while(test != 0);
            gcd = mult/count2;
            log.info("GCD is " + gcd);

        }else if(i2 > i1){                              //if withLog4j number bigger than the first one
            do{
                count1 = count1 + i1;
                test = count1%i2;

            }while(test != 0);
            gcd = mult/count1;
            log.info("GCD is " + gcd);
        }

    }

}
