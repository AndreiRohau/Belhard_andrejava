package objects;

public class A {
    private static int a;

    public A(int a){

        this.a = a;
    }

    public static int getA() {
        return a;
    }

    public static void setA(int a) {
        A.a = a;
    }

        @Override
    public String toString() {
        String n = "this.a";
        return n;
    }
}
