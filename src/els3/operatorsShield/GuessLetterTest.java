package els3.operatorsShield;

/**
 * Created by Admin on 29.01.2017.
 */
public class GuessLetterTest {
    public static void main(String[] args)
            throws java.io.IOException {
        char ch,ignore;
        System.out.print("Введите символы:  ");

        do  {
            ch=(char) System.in.read();

            System.out.println("Вы ввели символ  "+ch);
            /*do {
                ignore=(char) System.in.read();
            }while(ignore!='\n');*/
        }while (ch!='.');
    }
}
