package task16;

import java.util.logging.Logger;

/**
 * сделать класс-утилиту со
 * статическими переменными и методами, являющийся русско-английским словарем,
 * в котором должны храниться для каждого русского слова - перевод на английский и наоборот.
 * Пользователь должен иметь возможность получить перевод слова, вызывая метод класса.
 * Можно решать с помощью 2-х переменных, в которых будут храниться map,
 * или через стороннюю коллекцию, которая может доставать ключ по value

 */
public class Main {
    private static final Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        Util u = new Util();
        Util.menu(u);

    }



}
