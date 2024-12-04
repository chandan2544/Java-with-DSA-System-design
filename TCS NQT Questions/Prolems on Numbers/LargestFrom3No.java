import java.util.Scanner;

public class LargestFrom3No {

    public static void findLargestFrom3No(int n1,int n2,int n3){
        if(n1>n2){
            if (n1>n3) {
                System.out.println(n1+" is largest no.");
            }else{
                System.out.println(n3+" is largest no.");
            }
        }else{
            if(n2>n1){
                if (n2>n3) {
                    System.out.println(n1+" is largest no.");
                }else{
                    System.out.println(n3+" is largest no.");
                }
            }else{
                System.out.println(n1+" is largest no.");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("enter 1st no. : ");
        int n1=sc.nextInt();
        System.out.print("enter 2nd no. : ");
        int n2=sc.nextInt();
        System.out.print("enter 3rd no. : ");
        int n3=sc.nextInt();

        LargestFrom3No.findLargestFrom3No(n1, n2, n3);
        
    }
}
