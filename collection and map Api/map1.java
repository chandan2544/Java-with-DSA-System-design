// Maps -  in which data is stored in the form of entry 
// and entries are the combination of keys and and values
//in which key must be unique

import java.util.*;

public class map1 {
    public static void main(String[] args) {

        // HashMap hm = new HashMap();
        // Hashtable ht = new Hashtable();
        // LinkedHashMap lhm = new LinkedHashMap();
        // TreeMap tm = new TreeMap();

        HashMap hm1 = new HashMap();
        // null value are allowed
        // any datatype can be used

        hm1.put(null, null);
        hm1.put(02, "Aman");
        hm1.put(03, "abhishek");
        hm1.put(04, "chandan");

        System.out.println(hm1);

        HashMap hm2 = new HashMap<>();
        hm2.put("virat", null);
        hm2.put("rohit", "Aman");
        hm2.put("rishav", "abhishek");
        hm2.put("ankush", "chandan");

        System.out.println(hm2);

        LinkedHashMap lhm = new LinkedHashMap<>();
        lhm.put("rohit", "Aman");
        lhm.put("rishav", "abhishek");
        lhm.put("ankush", "chandan");

        System.out.println(lhm);

    }
}