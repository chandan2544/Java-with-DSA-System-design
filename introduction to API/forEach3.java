//inbuilt foreach( consumer ) in java

import java.util.*;
import java.util.ArrayList;
import java.util.function.Consumer;

public class forEach3 {
    public static void main(String[] args) {
        // List<Integer> list=new ArrayList<>();
        // list.add(2);
        // list.add(4);
        // list.add(5);
        // list.add(8);
        // list.add(9);

        List <Integer> list2=Arrays.asList(2,4,5,8,9);
        System.out.println(list2);

        // for (Integer i : list2) {
        //     System.out.println(i);
        // }

       // if we  pass consumer argument
       // for Each method
        list2.forEach(n->System.out.println(n));

        System.out.println("------------------------------");
        // if we don't pass consumer argument
        Consumer<Integer> cons=i->System.out.println(i);
        list2.forEach(cons);
    }
}
