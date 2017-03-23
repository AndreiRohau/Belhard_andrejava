package els3.simpleArrays;

public class SimpleArray {
        public static void main(String args[]){

        int sample[] = new int[10];
        int i;

        for(i = 0; i < 10; i++) {
            sample[i] = i + 1;
        }

        for(i = 0; i < 10; i++) {
            System.out.println("Элeмeнт[" + i + "]: " + sample[i]);
        }
    }
}
