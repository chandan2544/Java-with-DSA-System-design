import java.util.Scanner;

public class factorialNo {
    
    public static void calcFactorial(int n){
        int fact = 1;

        for(int i=1;i<=n;i++){
            fact*=i;
        }
        System.out.println("factorial of "+n+" is "+fact);
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("enter no. : ");
        int n=sc.nextInt();

        factorialNo.calcFactorial(n);
        
    }
}
