package task14;

import java.util.HashSet;

/**
 * Created by rohau.andrei on 11.04.2017.
 */
public class Hash {

//    //make HashSet
//    public void setHash (int n) {
//        HashSet<Integer> hash = new HashSet<>();
//    }
    //add to HashSet
    public static HashSet<Integer> addToHash(int n) {
        HashSet<Integer> hash = new HashSet<>();
        for (int i = 0; i < n; i++) {
            hash.add(i);
        }
        return hash;
    }
    //add(index) HashSet
    public static void addIndexToHash (int n) {
        System.out.println("add(index) невозможен для HashSet коллекций");
    }
    //set HashSet
    public static void setHash(int n) {
        System.out.println("set(index) невозможен для HashSet коллекций");
    }
    //get HashSet
    public static void getHash(int n) {
        System.out.println("get(index) невозможен для HashSet коллекций");
    }
    //remove HashSet
    public static void removeByElementHash(HashSet<Integer> hash, int n) {
        for (int i = 0; i < n; i++) {
            hash.remove(i);
        }
    }
    public static void removeAllHash(HashSet<Integer> hash, int n) {
        for (int i = 0; i < n; i++) {
            hash.removeAll(hash);
        }
    }

}
