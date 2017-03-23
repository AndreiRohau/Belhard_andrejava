package els3.logging_research.first;

import java.util.logging.Logger;

/**
 * Created by rohau.andrei on 23.03.2017.
 */
public class Someclass {

    private static Logger log = Logger.getLogger(Someclass.class.getName());

    public void someMethod() {
        log.info("Some message");
    }
}
