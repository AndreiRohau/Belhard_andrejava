package tasksDone.task20;

import java.util.logging.Logger;

/**
 * Created by rohau.andrei on 27.04.2017.
 */
public class Main {
    private static final Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String... args) {
        String phoneNumber1 = "123-456-7890";
        String phoneNumber2 = "asd-456-7890";
        int numberLength = 10;
        String regularExpression = "[^0-9]";

        class PhoneNumber {
            String formattedPhoneNumber = null;

            PhoneNumber(String phoneNumber){
                String currentNumber = phoneNumber.replaceAll(regularExpression, "");
                if (currentNumber.length() == numberLength) {
                    formattedPhoneNumber = currentNumber;
                }else {
                    formattedPhoneNumber = null;
                }
            }

            public String getNumber() {
                return formattedPhoneNumber;
            }

            public void printOriginalNumbers() {
                log.info("Original nubmers are " + phoneNumber1 + " and " + phoneNumber2);
            }
        }

        PhoneNumber myNumber1 = new PhoneNumber(phoneNumber1);
        PhoneNumber myNumber2 = new PhoneNumber(phoneNumber2);

        myNumber1.printOriginalNumbers();

        if (myNumber1.getNumber() == null) {
            log.info("First number is invalid");
        }else {
            log.info("First number is " + myNumber1.getNumber());
        }
        if (myNumber2.getNumber() == null) {
            log.info("Second number is invalid");
        }else {
            log.info("Second number is " + myNumber2.getNumber());
        }
    }

}
