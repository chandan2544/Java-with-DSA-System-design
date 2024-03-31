//interrup() in java

package Multithreading;

class  example implements Runnable{
    public void run(){
        for (int i = 0; i < 3; i++) {
            try {
                System.out.println("focus is important ");
                Thread.sleep(3000);    
            } catch (Exception e) {
                System.out.println("thread is interrupted ");
            }
            
        }
    }
}
public class interact9 {
    public static void main(String[] args) {
        example ex=new example();

        Thread t1=new Thread(ex);
        t1.start();
        t1.interrupt();
    }
}
