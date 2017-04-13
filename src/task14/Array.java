package task14;

import java.util.ArrayList;

/**
 * add
 * add(index)
 * set
 * get
 * remove.
 * сравнить arraylist linkedlist hashset.
 */
public class Array {

//    //make Arraylist
//    public ArrayList<Integer> setArr () {
//        ArrayList<Integer> arr = new ArrayList<>();
//        return arr;
//    }
    //add to ArrayList
    public static ArrayList<Integer> addToArr(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(i);
        }
        return arr;
    }
    //add(index) ArrayList
    public static ArrayList<Integer> addIndexToArr (int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(i, n - 1 - i);
        }
        return arr;
    }
    //set Arraylist
    public static void setArr(ArrayList<Integer> arr, int n) {
        for (int i = 0; i < n; i++) {
            arr.set(n - 1 - i, i);
        }
    }
    //get Arraylist
    public static void getArr(ArrayList<Integer> arr, int n) {
        for (int i = 0; i < n; i++) {
            arr.get(i);
        }
    }
    //remove Arraylist
    public static void removeByIndexArr(ArrayList<Integer> arr, int n) {
        for (Integer i = 0; i < n; i++) {
            arr.remove(i);
        }
    }
    public static void removeByElementArr(ArrayList<Integer> arr, int n) {
        for (Integer i = 0; i < n; i++) {
            arr.remove(i);
        }
    }
}
