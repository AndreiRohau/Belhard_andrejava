package tasksDone.task10;

import java.util.logging.Logger;

/**
 * Created by Admin on 22.02.2017.
 */
public class Sportsman {
    private static Logger log = Logger.getLogger(Sportsman.class.getName());

    private int g;
    private int s;
    private int b;

    public Sportsman() {
        this.g = g;
        this.s = s;
        this.b = b;

    }

    //getter and setter starts here

    public int getG() {
        return g;
    }

    public void setG(int g) {
        this.g = g;
    }

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    //getter and setter ends here

    public void start () {
        log.info("_activity_");
    }

}
