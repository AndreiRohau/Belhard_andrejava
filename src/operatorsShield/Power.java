package operatorsShield;

/**
 * выводи 2 в степенях. НО почему?! result ведь постоянно обн
 */
public class Power {
    public static void main(String args[]) {
        int е;
        int result;
        for (int i = 0; i < 10; i++) {
            result = 1;
            е = i;
            while (е > 0) {
                //System.out.println(result);
                result *= 2;
                е--;
            }
            System.out.println("2 в степени " + i + " равно " + result);
        }
    }
}
