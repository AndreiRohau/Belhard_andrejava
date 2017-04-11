package tasksDone.task10;

import java.util.logging.Logger;

/**
 * Created by Admin on 22.02.2017.
 */
public class Runner extends Sportsman {
    private static Logger log = Logger.getLogger(Runner.class.getName());




    @Override
    public void start () {
        log.info("_run_");
    }

}
