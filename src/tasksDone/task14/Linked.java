package tasksDone.task14;

import java.util.LinkedList;

/**
 * Created by rohau.andrei on 11.04.2017.
 */
public class Linked {
    
//    //make Linkedlist
//    public void setLinked () {
//        LinkedList<Integer> linked = new LinkedList<>();
//    }
    //add to LinkedList
    public static LinkedList<Integer> addToLinked(int n) {
        LinkedList<Integer> linked = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            linked.add(i);
        }
        return linked;
    }
    //add(index) LinkedList
    public static LinkedList<Integer> addIndexToLinked (int n) {
        LinkedList<Integer> linked = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            linked.add(i,n - 1 - i);
        }
        return linked;
    }
    //set LinkedList
    public static LinkedList<Integer> setLinked(LinkedList<Integer> linked, int n) {
        for (int i = 0; i < n; i++) {
            linked.set(n - 1 - i, i);
        }
        return linked;
    }
    //get LinkedList
    public static void getLinked(LinkedList<Integer> linked, int n) {
        for (int i = 0; i < n; i++) {
            linked.get(i);
        }
    }
    //remove LinkedList
    public static void removeByIndexLinked(LinkedList<Integer> linked, int n) {
        for (Integer i = 0; i < n; i++) {
            linked.remove(i);
        }
    }
    public static void removebyElementLinked(LinkedList<Integer> linked, int n) {
        for (Integer i = 0; i < n; i++) {
            linked.remove(i);
        }
    }
}
