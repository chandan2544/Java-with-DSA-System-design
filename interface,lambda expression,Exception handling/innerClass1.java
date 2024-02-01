// inner class in java
// types of inner class are - 1.member , 2.static and 3.Anonymous
//1.member , 2.static  discussed 

class A {

    public void show() {
        System.out.println("in show");
    }

    // static class B {
    class B {

        public void display() {
            System.out.println("in display");
        }
    }
}

public class innerClass1 {
    public static void main(String[] args) {
        A obj = new A();

        //  in static member  class
        // A.B obj1 = new A.B();
        
        A.B obj1 = obj.new B();
        obj.show();
        obj1.display();
    }
}
