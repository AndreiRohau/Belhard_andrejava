package els3.tuesday_17_01_2017;
/*  in main create object of this class to put elements into this object

 */

public class Main {
    public static void main(String[] args) {

        Constructor<Integer, String, Float> room1 = new Constructor<Integer, String, Float>(1, "kitchen", 20.2F);
        Constructor<String, String, Integer> man = new Constructor<String, String, Integer>("bedroom", "bedroom", 20);
        Constructor<Integer, Integer, Integer> cat = new Constructor<Integer, Integer, Integer>(3, 3, 20);
    }

}
