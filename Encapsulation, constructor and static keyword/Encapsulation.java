class student{
    private int age;
    private String name;

    void setData(){
        age=22;
        name="chandan";
    }
    void show(){
        System.out.println(name + " " + age);
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        student obj=new student();

        // obj.age=23;
        // obj.name="chandan";
        obj.setData();
        obj.show();
    }
}