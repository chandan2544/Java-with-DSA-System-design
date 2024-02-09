// Generic Collection inbuilt methods

import java.util.ArrayList;
import java.util.Collections;

public class generic4 {
    public static void main(String[] args) {
        ArrayList a1=new ArrayList();
        a1.add(100);
        a1.add(50);
        a1.add(150);
        a1.add(25);
        a1.add(75);
        a1.add(125);
        System.out.println(a1);
        Collections.sort(a1);
        System.out.println(a1);

        ArrayList<String> a2=new ArrayList<String>();
        a2.add("PW");
        a2.add("chandan");
        a2.add("Java");
        a2.add("Learning");
        
        System.out.println(a2);
        Collections.sort(a2);
        System.out.println(a2);

        ArrayList a3=new ArrayList();
        a3.add(10);
        a3.add(20);
        a3.add(30);
        a3.add(40);
        System.out.println(a3);

        // if value present then it will give index value
        //if its not present in  given data then it will give  -ve value

        int index=Collections.binarySearch(a3, 20);
        System.out.println("present at index : "+index);

        Collections.rotate(a3, 3);
        System.out.println(a3);

        Collections.shuffle(a3);
        System.out.println(a3);

        Collections.frequency(a3, 20);
        System.out.println(a3);
    }
}
