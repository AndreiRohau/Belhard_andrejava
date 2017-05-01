package tasksDone.task15;

/**
 * Created by rohau.andrei on 01.05.2017.
 */


import org.apache.commons.collections4.ListUtils;

import java.util.ArrayList;
import java.util.List;

public class ApacheCollectionUnion {
    public static void apacheCollectionUnion() {

        List<String> listA = new ArrayList<String>();
        listA.add("A");

        List<String> listB = new ArrayList<String>();
        listB.add("B");

        List<String> listFinal = ListUtils.union(listA, listB);

        System.out.println("listA : " + listA);
        System.out.println("listB : " + listB);
        System.out.println("listFinal : " + listFinal);

    }

}


