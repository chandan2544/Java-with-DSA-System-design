// exceptional_handling in java
//type of errors - 1.syntax error 2.logical error and 3.runtime error

// runtime  error

public class exceptional_handling1 {
    public static void main(String[] args) {
        int a = 6;
        int b = 0;

        int result=a/b;

        System.out.println(result);
        
        System.out.println("successfull"); // not printed
    }
}
