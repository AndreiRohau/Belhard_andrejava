package tasksDone.task11;

import java.util.logging.Logger;

/**
 * Created by Admin on 27.02.2017.
 */
public class Main {
    private static Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        Apple dev1 = new Apple("Iphone 6", 2, 600);
        dev1.devFunc();
        log.info(dev1.getCompany()
                + " " + dev1.getName()
                + " " + dev1.getPrice() + "$ "
                + " status is " + dev1.getStatus());
        dev1.specFunc();
        System.out.println();

        Apple dev2 = new Apple("AppleTV", 1, 1600);
        dev2.devFunc();
        log.info(dev2.getCompany()
                + " " + dev2.getName()
                + " " + dev2.getPrice() + "$ "
                + " status is " + dev2.getStatus());
        dev2.specFunc();
        System.out.println();

        Samsung dev3 = new Samsung("Galaxy Edge", 2, 550);
        dev3.devFunc();
        log.info(dev3.getCompany()
                + " " + dev3.getName()
                + " " + dev3.getPrice() + "$ "
                + " status is " + dev3.getStatus());
        dev3.specFunc();
        System.out.println();

        Samsung dev4 = new Samsung("PLAZMA", 1, 350);
        dev4.devFunc();
        log.info(dev4.getCompany()
                + " " + dev4.getName()
                + " " + dev4.getPrice() + "$ "
                + " status is " + dev4.getStatus());
        dev4.specFunc();




    }
}
