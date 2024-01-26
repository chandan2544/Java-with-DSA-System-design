class student1{
    private String name;
    private int age;

    // default constructor
    public student1(){
        System.out.println("default constructor is called ");
        name="Rohan";
        age=18;
    }
    // parameterized constructor
    public student1(String name){
        this.name=name;
        age=19;
    }
    
    public  student1(String  name,int age){
        this.name=name;
        this.age=age;
    }

    public void display(){
        System.out.println(name);
        System.out.println(age);
    }
}

public class constructorOverloading {
    public static void main(String[] args) {
    
    student1 st1=new student1();
        st1.display();
    student1 st2=new student1("chandan");
        st2.display();
    student1 st3=new student1("chandan",15);
        st3.display();
           
    }
}
