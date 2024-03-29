package Multithreading;

public class mainThread1 {
    public static void main(String[] args) {
        System.out.println("main thread");
        System.out.println("before changing ");
        String name=Thread.currentThread().getName();
        System.out.println("name of thread : "+name); // main thread is by default name
        System.out.println("priorty of thread : "+Thread.currentThread().getPriority()); // default main thread priority is 5

        System.out.println("--------------------------------------");

        // we can also change the name and priority of thread as per need
        System.out.println("after changing");
        Thread t=Thread.currentThread();
        t.setName("mythread");
        t.setPriority(1);

        String name1 = Thread.currentThread().getName();
        System.out.println("name of thread : " + name1);
        System.out.println("priorty of thread : " + Thread.currentThread().getPriority());

    }
}
