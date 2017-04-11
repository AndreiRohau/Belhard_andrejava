package tasksDone.task2;

//есть 2 int переменные. Поменять их значения местами с помощью доп. переменной, операции xor

import java.util.Scanner; // импортируем класс
import java.util.logging.Logger;

public class Xor {
    private static Logger log = Logger.getLogger(Xor.class.getName());

    public static void xor() {

        log.info("Enter two numbers below:");
        Scanner sc = new Scanner(System.in);                    //input of two numbers
        int a = sc.nextInt();                                   //number one
        int b = sc.nextInt();                                   //number two

        log.info("a = " + a + ", b = " + b);
        a = a^b; // 1
        b = a^b; // 1
        a = a^b; // 2
        log.info("a = " + a + ", b = " + b);

    }

}
