package task_2;

//есть 2 int переменные. Поменять их значения местами с помощью доп. переменной, операции xor

import java.util.Scanner; // импортируем класс

public class Xor {

    public static void xor() {

        System.out.println("Enter two numbers below:");
        Scanner sc = new Scanner(System.in);                    //input of two numbers
        int a = sc.nextInt();                                   //number one
        int b = sc.nextInt();                                   //number two

        System.out.println("a = " + a + ", b = " + b);
        a = a^b; // 1
        b = a^b; // 1
        a = a^b; // 2
        System.out.println("a = " + a + ", b = " + b);

    }

}
