// how to handle Exception 

public class exceptional_handling2 {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 0;
        int result = 0;

        try {
            result = num1 / num2;
        } 
        catch (Exception e) {
            // TODO: handle exception
            System.out.println("Something went wrong " + e);
        }

        System.out.println(result);

        System.out.println("task done");
    }
}
