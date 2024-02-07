// collection 
// iterator or list iterator-used to fetch the data from collection

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class list_iterator {
    public static void main(String[] args) {
        ArrayList a1 = new ArrayList();
        a1.add(10);
        a1.add(20);
        a1.add(30);
        a1.add(100);

        System.out.println(a1);

        Iterator itr = a1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("***************************************");
        ListIterator litr = a1.listIterator(a1.size());
        while (litr.hasPrevious()) {
            System.out.println(litr.previous());
        }
    }
}
