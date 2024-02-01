// Anonymous inner class in java

interface Car {
    void drive();
}

public class innerClass2 {
    public static void main(String[] args) {

        // it can used only once
        Car obj = new Car() {
            public void drive() {
                System.out.println("Vroom  vroom....");
            }
        };
        obj.drive();
    }
}
