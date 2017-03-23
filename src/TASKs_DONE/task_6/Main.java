package TASKs_DONE.task_6;

import els3.logging_research.first.Someclass;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 * snake
 *
 * поскольку метод snake B Snake.class is non static, мы должны создать объект типа класса.
 * Snake bitch = new Snake; этим действием мы выделили память(?).
 * далее в bitch.snake(x); мы реализуем метод через объект, т.е. работая в памяти для объекта.
 * метод showStatic - статичный, значит память выделена для него,
 */
public class Main {
    private static Logger log = Logger.getLogger(Someclass.class.getName());
    public static void main(String[] args) {

        log.info("Input a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        //create object
        Snake snake = new Snake();
        //getting an array that is to be displayed
        int[][] arr = snake.snake(num);
        //out write this array
        snake.outWrite(arr);
    }
}
