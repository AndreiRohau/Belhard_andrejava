package task23;

import java.util.LinkedList;
import java.util.logging.Logger;

/**
 * создать LinkedList, заполнить его и используя for each цикл, удалить один из элементов
 */

public class Main {
    private static final Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        //количество букв
        int num = 5;

        //создаем линклист для букв
        LinkedList<Character> letters = new LinkedList<>();

        //какнибудь заполняем его
        char x = 'a';
        for(int i = 0; i < num; i++) {
            letters.add(x);
            x++;
        }
        for(char n: letters) {
            System.out.print(" " + n);
        }
        System.out.println();

        //при помощи foreach удаляем элемент 'c'
        int index = 0;
        for(char n: letters) {
            if (n == 'c') {
                index = letters.indexOf(n);
            }
            if (n == letters.getLast()) {
                letters.remove(index);
            }
        }

        for(char n: letters) {
            System.out.print(" " + n);
        }

    }
}