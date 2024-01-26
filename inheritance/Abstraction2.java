//impure abstraction 
// we can't make abstract variable 
// we can't make abstruct constructor becoz it have always super()by default

abstract class Aeroplane {
    abstract public void takeoff();

    abstract public void fly();

    public void landing() {
        System.out.println("Aeroplane is landing");
    }

}

class CargoPlane extends Aeroplane {
    public void takeoff() {
        System.out.println("CargoPlane reqire longer  runway");
    }

    public void fly() {
        System.out.println("CargoPlane flies at lower height");
    }

    public void Alert() {
        System.out.println("....Alert....");
    }

}

class PassengerPlane extends Aeroplane {
    public void takeoff() {
        System.out.println("PassengerPlane reqire medium runway");
    }

    public void fly() {
        System.out.println("PassengerPlane flies at medium height");
    }
}

public class Abstraction2 {
    public static void main(String[] args) {

        Aeroplane ref1 = new CargoPlane();
        ref1.takeoff();
        ref1.fly();

        // because its aspecialized method
        ((CargoPlane) ref1).Alert();

        Aeroplane ref2 = new PassengerPlane();
        ref1.takeoff();
        ref2.fly();

        // we can't make abstract class object becauseit was incomplete
        // wecan only referenced
        // Aeroplane ref3=new Aeroplane();
    }
}