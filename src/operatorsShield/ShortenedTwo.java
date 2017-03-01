package operatorsShield;

/**
 *              *=
 *              +=
 *              -=
 *              /=
 */
public class ShortenedTwo {
    public static void main(String[] args) {
        Multi();
        Plus();
        Minus();
        Div();
    }

    public static void Multi(){
        int x = 3;
        int y = 5;
        System.out.println("y *= x;         y = " + (y *= x));
    }

    public static void Plus(){
        int x = 3;
        int y = 5;
        System.out.println("y += x;         y = " + (y += x));
    }

    public static void Minus(){
        int x = 3;
        int y = 5;
        System.out.println("y -= x;         y = " + (y -= x));
    }

    public static void Div(){
        int x = 3;
        int y = 5;
        System.out.println("y /= x;         y = " + (y /= x));
    }



}
