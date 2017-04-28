package task24;

import java.util.*;

/**
 * Created by rohau.andrei on 27.04.2017.
 */
public class CountryCapitalTable {

    private HashMap<String, String> countryCapitalTable;

    public HashMap<String, String> getCountryCapital() {
        return countryCapitalTable;
    }

    public CountryCapitalTable() {
        this.countryCapitalTable = new HashMap<String,String>();
    }

    public void putCountryCapital(String country, String capital) {
        this.countryCapitalTable.put(country, capital);
    }

    public void displayCap() {
        TreeSet<String> capTree = new TreeSet<String>();
        Object[] cap = getCountryCapital().values().toArray();
        for (int i = 0; i < cap.length; i++) {
            Object capital = cap[i];
            capTree.add((String) capital);
        }
        SortedSet<String> sortedSet = capTree.tailSet(capTree.first());
        System.out.println(sortedSet);
    }
}
