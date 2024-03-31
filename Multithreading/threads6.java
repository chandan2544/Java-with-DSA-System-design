// join() and  isAlive() methods  

package Multithreading;

class printing implements Runnable{
    public void run(){
        try {
            for (int i = 0; i < 3; i++) {
                System.out.println("focus is  important");
                Thread.sleep(3000);
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("some problem");
        }
    }
}

public class threads6 {
    public static void main(String[] args) throws Exception {
        System.out.println("main thread started");
        printing p=new printing();
        
        Thread t1=new Thread(p);

        System.out.println(t1.isAlive()); //false
        t1.start();
        System.out.println(t1.isAlive()); // True
        t1.join();

        System.out.println("main thread finished the work");
    }
}
