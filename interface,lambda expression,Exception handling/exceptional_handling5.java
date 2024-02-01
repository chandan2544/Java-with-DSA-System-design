// try with resources is a extended version finally
// its used in banking software to automatical logout 

import java.util.Scanner;

public class exceptional_handling5 {
    public static void main(String[] args) {

        int num = 0;

        // try with resources
        try (Scanner sc = new Scanner(System.in);) {
            num = sc.nextInt();
        }

        System.out.println(num);
    }
}
