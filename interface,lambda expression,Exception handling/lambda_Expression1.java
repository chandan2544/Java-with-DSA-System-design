// Anonymous inner class modified technique is lambda_Expression

@FunctionalInterface
interface Car {
    void drive();
}

public class lambda_Expression1 {
    public static void main(String[] args) {

        // lambda_Expression
        Car obj = () -> System.out.println("Vroom Vroom .....");

        obj.drive();
    }
}

