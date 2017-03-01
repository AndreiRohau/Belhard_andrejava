package operatorsShield;

/**
 *              *=
 *              +=
 *              -=
 *              /=
 */
public class Shortened {
    public static void main(String[] args) {
        Multi();
        Plus();
        Minus();
        Div();
    }

    public static void Multi(){
        int x = 3;
        System.out.println("x *= x;         x = " + (x *= x));
    }

    public static void Plus(){
        int x = 3;
        System.out.println("x += x;         x = " + (x += x));
    }

    public static void Minus(){
        int x = 3;
        System.out.println("x -= x;         x = " + (x -= x));
    }

    public static void Div(){
        int x = 3;
        System.out.println("x /= x;         x = " + (x /= x));
    }



}
