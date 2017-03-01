package operatorsShield;

/**
 * Created by Admin on 31.01.2017.
 */
public class Goto2 {
    public static void main(String[] args) {

        for(int x=0; x < 5; x++)
        stop2: { // or { stop2:
            for (int y =0; y < 5; y++) {
                if (y == 2) {
                    break stop2;
                }
                System.out.println("x и у: " + x + " " + y);
            }
        }
    }
}
