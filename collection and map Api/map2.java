// Map

import java.util.*;

public class map2 {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable<>();

        // nullvalues are not allowed

        ht.put(1, "Rohit");
        ht.put(2, "Rohan");
        ht.put(3, "Ramesh");

        ht.putIfAbsent(2, "rohan");

        System.out.println(ht);

        TreeMap tm = new TreeMap();
        tm.put(1, "chandan");
        tm.put(2, "Aman");
        tm.put(3, "Anuj");

        System.out.println(tm);
    }
}
