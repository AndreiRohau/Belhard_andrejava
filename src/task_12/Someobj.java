package task_12;

/**
 * Created by Admin on 01.03.2017.
 */
public class Someobj {

    private int [] arr;

    public Someobj (int num) {
        this.arr = new int[num];
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public void changeArr(int num) {
        this.arr = new int[num];
    }
}
