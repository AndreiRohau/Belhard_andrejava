package els3.loggingResearch.tinyChanges;

/**
 * Created by Admin on 17.02.2017.
 */
public class Main {
    private static OrderLogic logic;

    public static void main(String[] args) {
        logic = new OrderLogic();
        logic.doOrder();
    }
}
