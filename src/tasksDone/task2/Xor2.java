package tasksDone.task2;

//есть 2 int переменные. Поменять их значения местами с помощью доп. переменной, операции xor

import java.util.Scanner; // импортируем класс
import java.util.logging.Logger;

public class Xor2 {
    private static Logger log = Logger.getLogger(Xor2.class.getName());

    public static void xor_2() {
        log.info("Enter two numbers below:");
        Scanner sc = new Scanner(System.in);                    //input of two numbers
        int a = sc.nextInt();                                   //number one
        int b = sc.nextInt();                                   //number two

        log.info("a = " + a + ", b = " + b);
        a = a-b;
        b = b+a;
        a = b-a;
        log.info("a = " + a + ", b = " + b);

    }

}
