public class instance_variable {
    int i = 10;

    public static void main(String[] args) {
       // System.out.println(i);// CE: non static variable can’t be referenced
        
       instance_variable t = new instance_variable();
        System.out.println(t.i);// valid
        t.m1();
    }

    public void m1() {
        System.out.println(i);// valid
    }
}
