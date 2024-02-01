// interface in java
interface A {
    int num = 6;

    void show();
}

public class interface1 {
    public static void main(String[] args) {
        System.out.println(A.num);
        
        // we can't acess interface by creating object
        // A obj=new A();
    }
}
