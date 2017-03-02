package TASKs_DONE.task_2;

//есть 2 int переменные. Поменять их значения местами с помощью доп. переменной, операции xor

import java.util.Scanner; // импортируем класс

public class Xor_2 {

    public static void xor_2() {
        System.out.println("Enter two numbers below:");
        Scanner sc = new Scanner(System.in);                    //input of two numbers
        int a = sc.nextInt();                                   //number one
        int b = sc.nextInt();                                   //number two

        System.out.println("a = " + a + ", b = " + b);
        a = a-b;
        b = b+a;
        a = b-a;
        System.out.println("a = " + a + ", b = " + b);

    }

}
