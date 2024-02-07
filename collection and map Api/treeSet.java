// collection
// TreeSet 
// duplicates are not allowed

import java.util.TreeSet;

public class treeSet {

    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add(100);
        ts.add(50);
        ts.add(150);
        ts.add(25);
        ts.add(75);
        ts.add(125);
        ts.add(175);

        System.out.println(ts);

        // TreeSet inbuilt methods
        System.out.println("lower values from 50 in TreeSet : " + ts.lower(50));
        System.out.println("higher values from 50 in TreeSet : " + ts.higher(50));
        // ts.ceiling(ts);
        // ts.floor(ts);
    }
}