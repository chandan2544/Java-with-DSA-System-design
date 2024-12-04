
import java.util.Scanner;

public class primeNo {
    
    public static void checkPrimeNo(int n){
        int temp=0;

        for (int i = 2; i <= n-1; i++) {
            temp = temp+1;
        }

        if(temp%2==0){
            System.out.println(n+" not a prime No.");
        }else{
            System.out.println(n+" prime No.");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("enter no. : ");
        int n=sc.nextInt();

        primeNo.checkPrimeNo(n);
    }
}
