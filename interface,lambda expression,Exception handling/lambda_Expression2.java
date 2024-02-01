@FunctionalInterface
interface Car {
    void drive(int avg);
}

public class lambda_Expression2 {
    public static void main(String[] args) {

        // lambda_Expression
        Car obj = avg -> System.out.println("Vroom Vroom ..... "+avg);
        obj.drive(16);
    }
}
