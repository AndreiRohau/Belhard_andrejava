package operatorsShield;

public class InputInFor {

        public static void main(String args[])
                throws java.io.IOException {
        int i;
        System.out.println("Угадай какую я загадал цифру?");
        for (i = 1; (char) System.in.read() != '1'; i++) {
            System.out.println("Не угадал - еще!! Попыток: " + i);
        }
            System.out.println("Ну наконец-то! И всего-то попыток: " + i);
    }
}
