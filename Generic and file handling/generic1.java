// Need of Generics

import java.util.ArrayList;

public class generic1 {
    public static void main(String[] args) {
        // TypeSafety
        // String ar[]=new String[10];
        // ar[0]="chandan";
        // ar[1]="kumar";
        // ar[2]=10; //CE

        // No typesafety
        // Typesafety achived using generics
        ArrayList <String> a1=new ArrayList<String>();

        a1.add("chandan");
        a1.add("kumar");

        //a1.add(10);

        //String n1=(String)a1.get(0); //typecasting
        //String n2=(String)a1.get(1);
        //String n3=(String)a1.get(2);

        String name1=a1.get(0);
        String name2=a1.get(1);

        System.out.print(name1 + name2);
    }
}