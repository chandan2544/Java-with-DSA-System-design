import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("---- Check Odd or Even no. ----");
        System.out.print("enter no. : ");
        int n=sc.nextInt();

        if (n%2==0) {
            System.out.println(n+" is Even no.");
        }else{
            System.out.println(n+" is Odd no.");
        }
    }
}
