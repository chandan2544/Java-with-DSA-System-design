// static Variable vs Instance Variable

class Alpha{
    // static block are executed at the time of loading
    static int a;
    static int b;

    // instance variable/block when we  create obj then it will executed
    int m;
    int n;

    static{
        System.out.println("static block");
        a=10;
        b=20;
    }

    {
        System.out.println("non static block");
        m=100;
        n=200;
    }
}

// therefore static  block executed one time
// and non static  block executed no. of time object is created

public class staticVariableVsInstanceVariable {
    public static void main(String[] args) {
        Alpha a1=new Alpha();
        Alpha  a2=new Alpha();

    }
}
