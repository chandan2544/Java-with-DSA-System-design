// hierachical inheritance

class Animal { //extend object
    void sleep() {
        System.out.println("Animal need  sleep");
    }
}

class Tiger extends Animal {

}

class Monkey extends Animal {

}

class Deer extends Animal {

}

public class hierachical_inheritance {
    public static void main(String[] args) {
        Tiger t=new Tiger();
        t.sleep();
        Animal a=new Animal();
        // a.notify();
    }
}
