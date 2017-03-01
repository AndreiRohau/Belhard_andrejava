package task_12;

/**
 * Created by Admin on 27.02.2017.
 */
public class Branch {
    private long fruitCount;
    private int num;
    private Branch [] branch;
    private long allFruits;

    public Branch (long fruits, int num) {
        this.fruitCount = fruits;
        this.num = num;
        this.branch = new Branch[num];
        this.allFruits = num;
    }

    public Branch (long fruits) {
        this.fruitCount = fruits;
        this.num = (int) (Math.random() * 10);
        this.branch = new Branch[num];
    }

    public Branch (int num) {
        this.fruitCount = (long) (Math.random() * 100);
        this.num = num;
        this.branch = new Branch[num];
    }

    public Branch () {
        this.fruitCount = (long) (Math.random() * 100);
        this.num = (int) (Math.random() * 10);
        this.branch = new Branch[num];
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

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void changeArr(int num) {
        this.branch = new Branch[num];
    }

    public void growBranches () {
        for (int i = 0; i < this.branch.length; i++) {
            this.branch[i] = new Branch();
        }
    }

    public void monkeyCounter () {}
}
