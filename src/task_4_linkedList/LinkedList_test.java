package task_4_linkedList;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by Admin on 13.02.2017.
 */
public class LinkedList_test {
    public static void main(String[] args) {

        //Вводим число
        System.out.println("Enter a number ");
        Scanner sc = new Scanner(System.in);            //input of two numbers
        int number = sc.nextInt(); // = and int
        LinkedList<Integer> stack = new LinkedList<Integer>();

        while (number > 0) {
            System.out.println("cycle " + number);
            stack.push(number);
            number--;

        }

//        while (!stack.isEmpty()) {
//            System.out.println(stack.pop());
//        }

        while (!stack.isEmpty()) {
            System.out.println(stack.getLast());
            stack.removeLast();
        }


//        for (int i = 0; ; i++) {





    }
}
