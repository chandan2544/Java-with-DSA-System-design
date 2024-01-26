// static Method Vs Non Static Method

 class Demo{
    static void disp1(){
        System.out.println("static method disp1");
    }

void disp2(){
System.out.println("non static method disp2");
}
 }
public class staticMethodVsNonStaticMethod {
    public static void main(String[] args) {
        Demo.disp1(); // static method is object independent

        Demo d=new Demo();
        d.disp2();    // non static method is object dependent
    }
}
