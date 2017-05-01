package tasksDone.task14;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * провести исследование
 * какая из коллекций выгоднее при операциях
 * add
 * add(index)
 * set
 * get
 * remove.
 * сравнить arraylist linkedlist hashset.
 * В результате на консоль должны быть выведены сообщения для каждой операции -
 * с временем, потраченным каждой коллекцией на операцию и вывод - что лучше использовать
 *
 * как сделать метод в который можно бросать любой метод?
 * (наш-Метод "замер исполнения какого-то-Метода": кидаем в наш-Метод "замера" любой-Метод, и
 * возвращаем время исполнения этого любого-Метода)
 */
public class Main {
    public static void main(String[] args) {

        //количество элементов, лучше 100 000
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        //замеры по методу add
        long addArrStart = System.currentTimeMillis();
        ArrayList<Integer> arr = Array.addToArr(num);
        long addArrFin = System.currentTimeMillis();
        long addArrDiff = addArrFin - addArrStart;

        long addLinkedStart = System.currentTimeMillis();
        LinkedList<Integer> linked = Linked.addToLinked(num);
        long addLinkedFin = System.currentTimeMillis();
        long addLinkedDiff = addLinkedFin - addLinkedStart;

        long addHashStart = System.currentTimeMillis();
        HashSet<Integer> hash = Hash.addToHash(num);
        long addHashFin = System.currentTimeMillis();
        long addHashDiff = addHashFin - addHashStart;

        System.out.println("Add to ArrayList: " + addArrDiff +
                            ", add to LinkedList: " + addLinkedDiff +
                            ", add to HashSet: " + addHashDiff +
                            "; best is: " + smallest(addArrDiff, addLinkedDiff, addHashDiff));

        //замеры по методу add(index, element)
        long addIndexToArrStart = System.currentTimeMillis();
        Array.addIndexToArr(num);
        long addIndexToArrFin = System.currentTimeMillis();
        long addIndexToArrDiff = addIndexToArrFin - addIndexToArrStart;

        long addIndexToLinkedStart = System.currentTimeMillis();
        Linked.addIndexToLinked(num);
        long addIndexToLinkedFin = System.currentTimeMillis();
        long addIndexToLinkedDiff = addIndexToLinkedFin - addIndexToLinkedStart;

        Hash.addIndexToHash(num);
        String bestInAddIndex;
        if (addIndexToLinkedDiff > addIndexToArrDiff) {
            bestInAddIndex = "ArrayList";
        }else {
            bestInAddIndex = "LinkedList";
        }

        System.out.println("Add(index, E) to ArrayList: " + addIndexToArrDiff +
                ", add(index, E) to LinkedList: " + addIndexToLinkedDiff +
                "; best is: " + bestInAddIndex);

        //замеры по методу set
        long setArrStart = System.currentTimeMillis();
        Array.setArr(arr, num);
        long setArrFin = System.currentTimeMillis();
        long setArrDiff = setArrFin - setArrStart;

        long setLinkedStart = System.currentTimeMillis();
        Linked.setLinked(linked, num);
        long setLinkedFin = System.currentTimeMillis();
        long setLinkedDiff = setLinkedFin - setLinkedStart;

        Hash.setHash(num);
        String bestSet;
        if (setLinkedDiff > setArrDiff) {
            bestSet = "ArrayList";
        }else {
            bestSet = "LinkedList";
        }

        System.out.println("set() to ArrayList: " + setArrDiff +
                ", set() to LinkedList: " + setLinkedDiff +
                "; best is: " + bestSet);

        //замеры по методу get
        long getArrStart = System.currentTimeMillis();
        Array.getArr(arr, num);
        long getArrFin = System.currentTimeMillis();
        long getArrDiff = getArrFin - getArrStart;

        long getLinkedStart = System.currentTimeMillis();
        Linked.getLinked(linked, num);
        long getLinkedFin = System.currentTimeMillis();
        long getLinkedDiff = getLinkedFin - getLinkedStart;

        Hash.getHash(num);
        String bestGet;
        if (getLinkedDiff > getArrDiff) {
            bestGet = "ArrayList";
        }else {
            bestGet = "LinkedList";
        }

        System.out.println("get() to ArrayList: " + getArrDiff +
                ", get() to LinkedList: " + getLinkedDiff +
                "; best is: " + bestGet);

        //замеры по методу remove
        long removeArrStart = System.currentTimeMillis();
        Array.removeByIndexArr(arr, num);
        long removeArrFin = System.currentTimeMillis();
        long removeArrDiff = removeArrFin - removeArrStart;

        long removeLinkedStart = System.currentTimeMillis();
        Linked.removeByIndexLinked(linked, num);
        long removeLinkedFin = System.currentTimeMillis();
        long removeLinkedDiff = removeLinkedFin - removeLinkedStart;

        long removeAllHashStart = System.currentTimeMillis();
        Hash.removeAllHash(hash, num);
        long removeAllHashFin = System.currentTimeMillis();
        long removeAllHashDiff = removeAllHashFin - removeAllHashStart;

        System.out.println("remove(index) to ArrayList: " + removeArrDiff +
                ", remove(index) to LinkedList: " + removeLinkedDiff +
                ", removeAll() to HashSet: " + removeAllHashDiff +
                "; best is: " + smallest(removeArrDiff, removeLinkedDiff, removeAllHashDiff));

        //вновь заполняем для повторного удаления
        arr = Array.addToArr(num);
        linked = Linked.addToLinked(num);
        hash = Hash.addToHash(num);

        long removeByElementArrStart = System.currentTimeMillis();
        Array.removeByElementArr(arr, num);
        long removeByElementArrFin = System.currentTimeMillis();
        long removeByElementArrDiff = removeByElementArrFin - removeByElementArrStart;

        long removebyElementLinkedStart = System.currentTimeMillis();
        Linked.removebyElementLinked(linked, num);
        long removebyElementLinkedFin = System.currentTimeMillis();
        long removebyElementLinkedDiff = removebyElementLinkedFin - removebyElementLinkedStart;

        long removeByElementHashStart = System.currentTimeMillis();
        Hash.removeByElementHash(hash, num);
        long removeByElementHashFin = System.currentTimeMillis();
        long removeByElementHashDiff = removeByElementHashFin - removeByElementHashStart;

        System.out.println("remove(element) to ArrayList: " + removeByElementArrDiff +
                ", remove(element) to LinkedList: " + removebyElementLinkedDiff +
                ", remove(element) to HashSet: " + removeByElementHashDiff +
                "; best is: " + smallest(removeByElementArrDiff, removebyElementLinkedDiff, removeByElementHashDiff));


    }

    public static String smallest(long arr, long linked, long hash) {
        String r;
        if (arr < linked) {
            if (arr < hash){
                r = "arraylist";
            }else {
                r = "HashSet";
            }
        }else if (linked < hash) {
            r = "LinkedList";
        }else {
            r = "HashSet";
        }
        return r;
    }

}
