// comparator vs comparable
// comparator

import java.util.*;

class student {
    int marks, age;
    String name;

    public student(int marks, int age, String name) {
        this.marks = marks;
        this.age = age;
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "" + marks + "-" + age + "-" + name;
    }
}

// traditional way to use comparator
// class Alpha implements Comparator<student>{
// public int compare(student a,student b){
// if(a.marks>b.marks)
// return 1;
// else
// return -1;
// }
// }

public class generic5 {
    public static void main(String[] args) {
        student st1 = new student(45, 18, "Rohan");
        student st2 = new student(46, 17, "Rohit");
        student st3 = new student(44, 19, "Monu");

        List<student> list = new ArrayList<student>();

        list.add(st1);
        list.add(st2);
        list.add(st3);

        System.out.println(list);
        // Collections.sort(l);

        // Alpha a=new Alpha();

        // using lambda Expression
        Comparator<student> com = (student a, student b) -> {
            if (a.marks > b.marks)
                return 1;
            else
                return -1;
        };

        // Collections.sort(list, a);
        Collections.sort(list, com);
        System.out.println(list);

    }
}