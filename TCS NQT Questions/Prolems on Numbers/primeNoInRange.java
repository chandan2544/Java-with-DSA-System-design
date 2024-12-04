
import java.util.Scanner;

public class primeNoInRange {

    // method
    public static void findPrimeNoRange(int n){
        int temp=0;
        for(int i=1;i<=n;i++){
        for (int j = 2; j <= i-1; j++) {
            
            if(i%j==0){
                temp = temp+1;
            }
            
        }

        if(temp==0){
            System.out.print(i+" ");
        }else{
            temp=0;
          }
      }
    }
    
    // main method
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("enter no. : ");
        int n=sc.nextInt();

        primeNoInRange.findPrimeNoRange(n);
    }
}
