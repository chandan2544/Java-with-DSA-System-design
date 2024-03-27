// final class will not participate in inheritace
// final method will participate in inheritace but  not overriden by child class
// final variable will no be modified or changed throughout the program

//final class Animal {
class Animal {

    //final void sleep() {
    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Tiger extends Animal {

}

public class final1 {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.sleep();
    }
}
