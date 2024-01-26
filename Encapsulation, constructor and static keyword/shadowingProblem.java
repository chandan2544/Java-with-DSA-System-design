
class student{
    private int age;
    private String name;

    void setData1(int age){
        // here we make 
        age=age;
        // /* instance variable  */ age = age ; /* local variable  */ 
        // but compiler thought reeverse this  problem is called shadowing problem
        // it is resolved by using (this) keyword
        // eg this.age=age;

    }
    void setData2(String name){
        this.name=name;
    }
   
    void show(){
        System.out.println(name + " " + age);
    }
}

public class shadowingProblem {
    public static void main(String[] args) {
        student obj=new student();

        obj.setData1(18);
       obj.setData2("jdshgfjh");
        obj.show();
    }
}