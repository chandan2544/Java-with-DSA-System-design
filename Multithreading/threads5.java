// multiple threading achieved by using single run method

package Multithreading;

import java.util.Scanner;

import javax.print.DocFlavor.STRING;

class myThread1 extends Thread{
    public void run() {
        String tName=Thread.currentThread().getName();
        if (tName.equals("calc")) {
            calc();
        } else {
            impMessage();
        }
    }

    public void calc(){
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
    
    public void impMessage(){
        System.out.println("Displaying important message task");
        for (int i = 0; i < 3; i++) {
            System.out.println("focus is important to master skills");
        }

        System.out.println("displaying import message task ended ");
    }
}


public class threads5 {
    public static void main(String[] args) {
        System.out.println("main thread started");

        myThread1 thread1=new myThread1();
        myThread1 thread2 = new myThread1();

        thread1.setName("calc");
        thread2.setName("print");

        thread1.start();
        thread2.start();
    }
}
