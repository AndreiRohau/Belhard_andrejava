package tasksDone.task3Logging;

import java.util.logging.Logger;

public class Moves {

    private static Logger log = Logger.getLogger(Moves.class.getName());

    public static void moves() {
        byte x = 64;
        byte y;
        int i;
        x = (byte) (x >> 5);
        i = x << 5; // сдвиг влево
        y = (byte) (x >>>5); // сдвиг вправо с приведением

        log.info(String.valueOf(x));
        log.info(String.valueOf(y));
        log.info(String.valueOf(i));
    }

}
