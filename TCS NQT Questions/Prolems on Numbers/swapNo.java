// Swap number 

import java.util.*;
public class swapNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("enter 1st no. : ");
        int num1=sc.nextInt();
        System.out.print("enter 2nd no. : ");
        int num2=sc.nextInt();

        // int temp=0;
        // temp=num1;
        // num1=num2;
        // num2=temp;

        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;

        System.out.println("-------- After Swapping ----------");
        System.out.println("1st no. : "+num1);
        System.out.println("2nd no. : "+num2);
        
    
    }
}
