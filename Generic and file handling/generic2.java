// Generics
import java.util.*;

class Student1{
    private String name;
    private int id;
}

class Employee1{
    private String name;
    private int id;
}

public class generic2 {
    public static void main(String[] args) {
        Student1 st1=new Student1();
        Student1 st2=new Student1();

        Employee1 e = new Employee1();

        ArrayList <Student1> a1=new ArrayList<Student1>();
        a1.add(st1);
        a1.add(st2);
        //a1.add(e);
    }
}