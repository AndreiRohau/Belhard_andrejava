package TASKs_DONE.task_3_logging;

import els3.logging_research.first.Someclass;

import java.util.logging.Logger;

public class Moves {

    private static Logger log = Logger.getLogger(Someclass.class.getName());

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
