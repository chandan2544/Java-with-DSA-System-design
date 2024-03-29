// there are 2 type to create thread
// 1. by extending thread class
// 2. by implementing  runnable interface

package Multithreading;

// type 1 
class mythread extends Thread{
    public void run(){
        System.out.println("child class");
    }
}
public class threads2 {
    public static void main(String[] args) {
        System.out.println("by extending thread class");
        mythread t=new mythread();
        t.start();
    }
}
