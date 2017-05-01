package tasksDone.task19;

import java.util.logging.Logger;

/**
 * Created by rohau.andrei on 26.04.2017.
 */
public class Main {
    private static final Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args){

        try{
            int result = Factorial.getFactorial(0);
            log.info(String.valueOf(result));
        }
        catch(FactorialException ex){

            log.info(ex.getMessage());
            log.info(String.valueOf(ex.getNumber()));
        }
    }
}
