package ex_13_Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HS_LHS_TS {
    public static void main(String[] args) {
        Set<String> hs=new HashSet<>();
        // Hashing mechanism to store the element
        // no order maintained (stores values in random order)
        // no duplicates
        // e1 -> hashcode (xyz), e2 -> hashcode -> abc
        hs.add("Apple");
        hs.add("Orange");
        hs.add("WaterMelon");
        hs.add("WaterMelon");
        // hs.add(123); can not add as it is String hash set
        hs.add(null); //allows only one null entry
//      hs.add(null);
        System.out.println(hs);

        Set lhs=new LinkedHashSet();
        // LinkedList mechanism to store the element,
        // order will maintain, no duplicates
        lhs.add("Dpple");
        lhs.add("apple");
        lhs.add("Orange");
        lhs.add("WaterMelon");
        lhs.add("WaterMelon");
        lhs.add(null);
        System.out.println(lhs);
        System.out.println(lhs.isEmpty());
        System.out.println(lhs.contains("Apple"));
        System.out.println(lhs.size());

        Set ts = new TreeSet();
        // Black and Red Tree mechanism to store the element.
        // order will maintain, Natural Sorting is done.
        // Natural Sorting - ASCII values.

        ts.add("Dapple");
        ts.add("Apple");
        ts.add("apple");
        ts.add("Orange");
        ts.add("WaterMelon");
        //ts.add(123); same datatype can be added only because it sorts
        // ts.add(null);

        System.out.println(ts);
    }
}
