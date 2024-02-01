@FunctionalInterface
interface Car {
    void drive(int avg,int topSpeed);
}


public class lambda_Exprssion3 {
    public static void main(String[] args) {

        // lambda_Expression
        Car obj = (avg,topSpeed) -> System.out.println("Vroom Vroom ..... "+avg+" : "+topSpeed);
        obj.drive(16,90);
    }
    
}


  
