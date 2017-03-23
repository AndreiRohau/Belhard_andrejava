package els3.operatorsShield;

/**
 *  опять двойная этарация почему-то
 *
 */
public class Break {
    public static void main(String args[])
            throws java.io.IOException {
        char ch;
        for (; ; ) {
            System.out.println("Input a letter");
            ch = (char) System.in.read();// получить символ с клавиатуры
            if (ch == 'q') break; //Бесконечный " цикл, завершаемый оператором break
        }
        System.out.println("Bы нажали клавишу q!");
    }
}
