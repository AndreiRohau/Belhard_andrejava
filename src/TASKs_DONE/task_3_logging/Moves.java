package TASKs_DONE.task_3_logging;

import java.util.logging.Logger;

public class Moves {
    private static final Logger log = Logger.getLogger(String.valueOf(Main.class));//connect log4j
    public static void moves() {
        byte x = 64;
        byte y;
        int i;
log.info("heloow world");//vihod
        x = (byte) (x >> 5);
        i = x << 5; // сдвиг влево
        y = (byte) (x >>>5); // сдвиг вправо с приведением

        System.out.println(x);
        System.out.println(y);
        System.out.println(i);
    }

}
