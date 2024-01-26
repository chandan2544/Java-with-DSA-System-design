class demo {
    private int a;
    private int b;

    public demo(){
        System.out.println("default constructor");
    }

    public demo(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void display() {
        System.out.println(a);
        System.out.println(b);
    }
}

public class defaultConstructor {
    public static void main(String[] args) {

        // here demo() is a default constructor call
        // default constuctor is automatically created at time of object creation by jvm if in whole program there is no constructor is created
        // but if there is any constructor is detected by jvm then it will not create default constructor you have to create itself   
        demo d = new demo();
        d.display();

        // parameterized constructor
        // it does not created automatically
        // we have tomake it and call it
        demo d2 = new demo(10, 20);
        d2.display();
    }
}
