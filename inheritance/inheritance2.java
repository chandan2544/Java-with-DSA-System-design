// inheritance in java

//super class //base class //parent class
class human {
    int age;
    private String name;

    // constructor
    human(){
System.out.println("human class constructor");
    }
    void sleep() {
        age = 18;
        System.out.println("human needs good sleep");
        System.out.println(age);
    }
}

// child class //sub class //derived class
class student extends human { 
// also constructor doesn't inherited directly

    // public student(){
        //super(); //super method calls to the parent class constructor
    // }

    void  disp(){
        System.out.println("age is : "+age);
      // private doesn't inherited directly // System.out.println("name is : "+name);
    }
}

class inheritance2 {
    public static void main(String[] args) {
        student st = new student();
        st.sleep();
        st.disp();
    }
}