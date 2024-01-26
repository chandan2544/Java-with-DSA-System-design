/* static variable vs non static variable */

class demo1{
    static int a;
    static int b;

    int m;
    int n;

    static {
        System.out.println("control in static block");
        a=10;
        b=20;
    }

    {
        System.out.println("control in non static block");
        m=30;
        n=20;
    }

    static void disp1(){
        System.out.println("value of static  var a: " +a);
        System.out.println("value of static  var b: " +b);
    }

    void disp2(){
        System.out.println("value of  nonstatic  var m: " +m);
        System.out.println("value of nonstatic  var n: " +n);
    }
}

public class staticAndNonStatic {

    public static void main(String[] args) {
        demo1 d=new demo1();
        demo1.disp1();
        d.disp2();
    }
}