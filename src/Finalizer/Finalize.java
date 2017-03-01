package Finalizer;

/**
 * Created by Admin on 09.02.2017.
 */
public class Finalize {
    public static void main(String[] args) {
        int count;
        FDemo ob = new FDemo(0);

        for(count=1; count < 1200000; count++)
            ob.generator(count);
    }
}
