package els3.easyLogger;

/**
 * Created by rohau.andrei on 28.04.2017.
 */
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;



public class MyBestLogger {

    private static Logger logger = Logger.getLogger("MyLog");

    public static void main(String[] args) {

        try {
            FileHandler fh;
            // This block configure the logger with handler and formatter
            fh = new FileHandler("d:\\git\\Belhard_andrejava\\myLogs\\MyLogFile.log", true);
            logger.addHandler(fh);
            logger.setLevel(Level.ALL);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);

        } catch (SecurityException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }
        // the following statement is used to log any messages
        logger.log(Level.WARNING,"My first log");
    }

}