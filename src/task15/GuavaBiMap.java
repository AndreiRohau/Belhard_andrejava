package task15;

/**
 * Created by rohau.andrei on 01.05.2017.
 */
import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

public class GuavaBiMap {

    public static void guavaBiMap() {
        BiMap<Integer, String> empIDNameMap = HashBiMap.create();

        empIDNameMap.put(new Integer(101), "Mahesh");
        empIDNameMap.put(new Integer(102), "Sohan");
        empIDNameMap.put(new Integer(103), "Ramesh");

        //Emp Id of Employee "Mahesh"
        System.out.println(empIDNameMap.inverse().get("Mahesh"));
    }
}