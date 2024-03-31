package Multithreading;

class Library implements Runnable {
    String res1 = new String("java");
    String res2 = new String("sql");
    String res3 = new String("DSA");

    public void run() {
        String name = Thread.currentThread().getName();
        if (name.equals("student1")) {
            try {
                Thread.sleep(3000);
                synchronized (res1) {
                    System.out.println("student 1 has " + res1);
                    Thread.sleep(3000);
                    synchronized (res2) {
                        System.out.println("student 1 has " + res2);
                        Thread.sleep(3000);
                        synchronized (res3) {
                            System.out.println("student 1 has " + res3);
                            Thread.sleep(3000);
                        }
                    }
                }
            } catch (Exception e) {
                System.out.println("some problem");
            }
        } else {
            try {
                Thread.sleep(3000);
                synchronized (res1) {
                    System.out.println("student 2 has " + res1);
                    Thread.sleep(3000);
                    synchronized (res2) {
                        System.out.println("student 2 has " + res2);
                        Thread.sleep(3000);
                        synchronized (res3) {
                            System.out.println("student 2 has " + res3);
                            Thread.sleep(3000);
                        }
                    }
                }
            } catch (Exception e) {
                System.out.println("some problem");
            }
        }
    }
}

public class deadlock8 {
    public static void main(String[] args) {
        Library lib = new Library();

        Thread t1 = new Thread(lib);
        Thread t2 = new Thread(lib);

        t1.setName("student1");
        t2.setName("student2");

        t1.start();
        t2.start();
    }
}
