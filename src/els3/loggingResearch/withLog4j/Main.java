package els3.loggingResearch.withLog4j;

/**
 * Created by rohau.andrei on 23.03.2017.
 */
public class Main {
    private static OrderLogic logic;

    public static void main(String[] args) {
        logic = new OrderLogic();
        logic.doOrder();
    }
}