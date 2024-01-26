// multilevel inheritance

class Demo1{
    void disp(){
        System.out.println("disp method written in demo1 class");
    }
}

class Demo2  extends Demo1{

}

class Demo3 extends Demo2{

}

public class multilevel_inheritance {
    public static void main(String[] args) {
        Demo3 d=new Demo3();
        d.disp();
    }
}
