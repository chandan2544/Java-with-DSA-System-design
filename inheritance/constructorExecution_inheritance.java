// Constructor execution in case of inheritance
//1.super()- which call constructor directly to the parent class constructor
//2.this()- which call constructor within the same class constructor

class Demo1{
    int a,b;
    public Demo1(){
        System.out.println("parent class constructor");
    }
    public Demo1(int x,int y){
        System.out.println("parameterized parent class constructor");
        a=x;
        b=y;
    }
}

class Demo2 extends Demo1{
    int m,n;
    public Demo2(){
      this(10,20);
      //super();
        System.out.println("child class constructor");
    }
    public Demo2(int x,int y){
        //super();
        System.out.println("parameterized child class constructor");
        m=x;
        n=y;
    }
}
public class constructorExecution_inheritance {
    public static void main(String[] args) {
        Demo2 d=new Demo2();
    }
}
