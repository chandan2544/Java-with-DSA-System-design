// enum with switch case

enum Result{
PASS,FAIL,NR;
}

public class Enum8 {
    public static void main(String[] args) {

        Result r = Result.PASS;
        // Result r = Result.FAIL;
        // Result r=Result.NR;

        switch (r) {
            case PASS:
                System.out.println("Passed");
                break; 
            case FAIL:
                System.out.println("Failed");
                break;
            case NR:
                System.out.println("No  Result");
                break;      
            default:
                break;
        }
    }
}
