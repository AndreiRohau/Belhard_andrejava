package TASKs_DONE.task_4_linkedList;

import els3.logging_research.first.Someclass;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Created by Admin on 13.02.2017.
 */
public class LinkedList_test {
    private static Logger log = Logger.getLogger(Someclass.class.getName());

    public static void main(String[] args) {

        //Вводим число
        log.info("Enter a number ");
        Scanner sc = new Scanner(System.in);            //input of two numbers
        int number = sc.nextInt(); // = and int
        LinkedList<Integer> stack = new LinkedList<Integer>();

        while (number > 0) {
            log.info("cycle " + number);
            stack.push(number);
            number--;

        }

//        while (!stack.isEmpty()) {
//            log.info(stack.pop());
//        }

        while (!stack.isEmpty()) {
            log.info(String.valueOf(stack.getLast()));
            stack.removeLast();
        }


//        for (int i = 0; ; i++) {





    }
}
