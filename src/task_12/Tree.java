package task_12;

/**
 * Created by Admin on 27.02.2017.
 */
public class Tree {
    private String type;

    public Tree (int type) {
        if (type == 1) {
            this.type = "BananaTree";
        }else {
            this.type = "CoconutTree";
        }
    }
}
