package els3.operatorsShield;

public class CuttedOperators {
    public static void main(String[] args) {
        xPx();
        xPxP();
        xPPxPx();
        xPP();
        PPx();

}
    //(x +=x++) is the same as (x = x + x++) and same as (x += x)
    public static void xPx() {


        int x = 3;
        x +=x++;
        System.out.println("x +=x++;            X = " + x);


        //same as upper
        x = 3;
        x = x + x++;
        System.out.println("x = x + x++;        X = " + x);


        //as well the same
        x = 3;
        x +=x;
        System.out.println("x +=x;              X = " + x);


        System.out.println("________________________________");
        System.out.println("");
    }

    //(x = x++ + x) is the same as (x = x + ++x)
    public static void xPxP(){
        int x = 3;
        x = x++ + x;
        System.out.println("x = x++ + x;        X = " + x);

        x = 3;
        x = x + ++x;
        System.out.println("x = x + ++x;        X = " + x);
        System.out.println("_________________________________");
        System.out.println("");


    }

    public static void xPPxPx(){
        int x = 3;
        x = ++x + x;
        System.out.println("x = ++x + x;        X = " + x);
        System.out.println("_________________________________");
        System.out.println("");

    }


    //x = x++
    public static void xPP(){
        int x = 3;
        System.out.println("x = x++;            X = " + (x = x++));
        System.out.println("_________________________________");
        System.out.println("");

    }


    //x = ++x   ||   x = ++x        || ++x
    public static void PPx(){
        int x = 3;
        System.out.println("x = x++;            X = " + (x = x++));

        x = 3;
        System.out.println("x = ++x;            X = " + (x = ++x ));

        x = 3;
        System.out.println("x = ++x;            X = " + (x = ++x ));

    }


}
