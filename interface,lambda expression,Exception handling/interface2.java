interface A {
    void show();
}

interface xyz {
    void abc();
}

class B implements A, xyz {
    public void show() {
        System.out.println("in show ");
    }

    public void abc() {
        System.out.println("in xyz");
    }
}

public class interface2 {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        obj.abc();

    }
}
