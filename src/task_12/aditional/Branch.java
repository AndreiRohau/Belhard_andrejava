package task_12.aditional;

/**
 * Created by Admin on 27.02.2017.
 */
public class Branch {
    private long fruitCount;
    private Branch[] branch;

    public Branch(long fruits, int num) {
        this.fruitCount = fruits;
        this.branch = new Branch[num];
    }

    public Branch(long fruits) {
        this.fruitCount = fruits;
        this.branch = new Branch[(int) Math.random() * 10];
    }

    public Branch(int num) {
        this.fruitCount = (long) Math.random() * 100;
        this.branch = new Branch[num];
    }

    public Branch() {
        this.fruitCount = (long) Math.random() * 100;
        this.branch = new Branch[(int) Math.random() * 10];
    }

    public Branch[] getBranch() {
        return branch;
    }

    public void setBranch(Branch[] branch) {
        this.branch = branch;
    }

    public long getFruitCount() {
        return fruitCount;
    }

    public void setFruitCount(long fruitCount) {
        this.fruitCount = fruitCount;
    }

}
