class student{
    private String name;
    private int age;

    public student(){
        // super();
        this("rohit",19);
        System.out.println("default constructor");
        name="rohan";
        age=18;
    }

    public student(String name){
        this();
        this.name=name;
        age=18;
    }

    public student(String name,int age){
        this.name=name;
        this.age=age;
    }

    void display(){
        System.out.println(name);
        System.out.println(age);
    }
}

public class this_SuperMethod {
    public static void main(String[] args) {
        student st1=new student();
        st1.display();

        student st2=new student("rahul");
        st2.display();
    }
}