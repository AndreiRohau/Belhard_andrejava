package tasksDone.task11;

import java.util.logging.Logger;

/**
 * Created by Admin on 27.02.2017.
 */
public class Samsung extends Device implements DevFunc{
    private static Logger log = Logger.getLogger(Samsung.class.getName());

    public Samsung (String name, int type, int price) {
        super(name, type, price);
        super.setCompany("Samsung Corp.");
        super.setStatus("OFF");
    }

    @Override
    public void devFunc () {
        super.on();
        log.info(getCompany() + " is glad to welcome. We are happy to know you have bought our " + super.getName() + ".");
        log.info(" All systems are " + super.getStatus() + ".");
        log.info(" We wish you will enjoy using our " + super.getName());
    }
    @Override
    public void specFunc () {
        if (getType() == "TV") {
            log.info("Got the signal... Cable TV is working correctly. You are able to watch 160 channels.");
        }else {
            log.info("Trying to call to " + getCompany() + " support service...");
        }
    }
}
