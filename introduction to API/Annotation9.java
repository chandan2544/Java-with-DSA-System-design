//Anotation  is used to give  the info to jvm that we  gonna perform that thing
// @Override , @FunctionalInterface

@FunctionalInterface

interface Demo{
    void disp();
    //void disp2();
}

// this is a parent class
class plane{
    public void planeFliesHeight(){
        System.out.println("plane is flying");
    }
}

// this is a child class or subclass
class cargoPlane extends plane{

    // overriden method
    @Override
    public void planeFliesHeight() {
        System.out.println("cargoPlane is flies low");
    }
}

public class Annotation9 {
    public static void main(String[] args) {

        //object of child class
        plane cp=new cargoPlane();
        cp.planeFliesHeight();
    }
}
