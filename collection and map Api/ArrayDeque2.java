// collection 
// ArrayDeque is behave like a double ended queue
// duplicates are allowed
//index based adding isnot allowed
// data inserted from rear and front 

import java.util.ArrayDeque;
public class ArrayDeque2 {
    public static void main(String[] args) {
        ArrayDeque ad1=new ArrayDeque();

        ad1.add(100);
        ad1.add(200);
        ad1.add(200);
        System.out.println(ad1);

        ad1.addFirst(10);
        ad1.addLast(20);
        System.out.println(ad1);
        
        ad1.add("pw");
        System.out.println(ad1);

        ad1.offer(500);      // offer used when inserted data is not compulsory 
        ad1.offerFirst(1);   // to add it could be added or could be not
        ad1.offerLast(10);
        System.out.println(ad1);
    }
}
