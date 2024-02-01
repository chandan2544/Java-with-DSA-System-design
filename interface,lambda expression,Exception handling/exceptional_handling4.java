// finally in Exception handling

import java.util.InputMismatchException;
import java.util.Scanner;

public class exceptional_handling4 {
    public static void main(String[] args) {

        int num=0;
        Scanner sc=new Scanner(System.in);

        try {
            num=sc.nextInt();
        } 
        catch (InputMismatchException e) {
            // TODO: handle exception
            System.out.println("plz enter the number");
        }
        finally
        {
            sc.close();
        }

        System.out.println(num);
    }
}
