package TASKs_DONE.task_10;

import els3.logging_research.first.Someclass;

import java.util.logging.Logger;

/**
 * У пловца сделать конструктор с 4 параметрами
 * (3 от спортсмена  + 1 свой - дистанция, на которой он специализируется.)
 */
public class Swimmer extends Sportsman {
    private static Logger log = Logger.getLogger(Someclass.class.getName());

    private int distance;

    public Swimmer (int d) {
        this.distance = d;
    }

    //getter and setter starts here

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    //getter and setter ends here


    @Override
    public void start () {
        log.info("_swim_");
    }

}
