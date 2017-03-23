package TASKs_DONE.task_10;

import els3.logging_research.first.Someclass;

import java.util.logging.Logger;

/**
 * Created by Admin on 22.02.2017.
 */
public class Runner extends Sportsman {
    private static Logger log = Logger.getLogger(Someclass.class.getName());




    @Override
    public void start () {
        log.info("_run_");
    }

}
