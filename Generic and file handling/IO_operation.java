// fundamental of I/O operation

class Student {
    private String name;
    private int age;
    private String city;

    public Student(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String toString() {
        return "Name : " + name + " | Age : " + age + " | City : " + city;
    }
}

public class IO_operation {

    public static void main(String[] args) {
        Student st1 = new Student("virat", 34, "Delhi");
        System.out.println(st1);

        Student st2 = new Student("Sachin", 44, "Mumbai");
        System.out.println(st2);
        
    }
}