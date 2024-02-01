// interface can change or modify using java 8 feature 
// 1.default
// 2.static
// 3.function

interface A {
    void show();

    // non static
    default void config() {
        System.out.println("in config");
    }

    // static
    static void abc() {
        System.out.println("in abc");
    }
}

class B implements A {
    public void show() {
        System.out.println("in show");
    }
}

public class interfacej8Feature {
    public static void main(String[] args) {
        // static
        A.abc();

        // non static
        A obj = new B();
        obj.show();
        obj.config();
    }
}
