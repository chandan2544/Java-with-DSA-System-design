// here we created  2 line of execution 
// which will execute first and their order will managed by thread scheduler
// which acts as a assistant of JVM
// thread schedular make sure cpu utilization
// output not compulsorily as per programmer 
 
package Multithreading;

import java.util.Scanner;

class calc extends Thread{
public void run(){
     System.out.println("Calculation task Started");

    Scanner sc = new Scanner(System.in);
    System.out.println("plz enter 1st no : ");
    int num1 = sc.nextInt();
    System.out.println("plz enter 2nd no : ");
    int num2 = sc.nextInt();

    int result = num1 + num2;
    System.out.println(result);
    System.out.println("Calculation task Ended");

    System.out.println("------------------------------");
}
}

class message extends Thread{
    public void run(){
        System.out.println("Displaying important message task");
        try {
            for (int i = 0; i < 3; i++) {
                System.out.println("focus is important to master skills");
                Thread.sleep(2000);
            }   
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("some problem");
        }

        System.out.println("displaying import message task ended ");
    }
}

public class threads3 {
    public static void main(String[] args) {
        System.out.println("main thread started");

        calc c=new calc();
        message m=new message();

        c.start();
        m.start();
    }
}
