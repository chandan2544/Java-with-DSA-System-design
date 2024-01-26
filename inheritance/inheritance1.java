// inheritance in java
// for inheritance we use extends keyword in  java

//super class //base class //parent class
class human {
    int age;

    void sleep() {
        age = 18;
        System.out.println(age);
        System.out.println("human needs good sleep");
    }
}

// child class //sub class //derived class
class student extends human { 

}

class inheritance1 {
    public static void main(String[] args) {
        student st = new student();
        st.sleep();
    }
}