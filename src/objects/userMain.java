package objects;//      https://github.com/AndreiRohau/belhard_andrejava.git

public class userMain {

    public static void main(String[] args) {
        A a = new A(5);
        System.out.println(A.getA());
        A.setA(6);

        B b = new B(a);
        A.setA(7);
//        System.out.println(objects.A.toString());
        System.out.println(A.getA());
        System.out.println(b.getB());


    }
}
