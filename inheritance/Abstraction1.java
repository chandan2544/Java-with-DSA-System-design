// abstraction in java
// the method which have only signature not have 
// any body / implementation called abstract method eg- abstract public void takeoff();
  // or  abstract public void fly();

//Any class that have atleast one abstract method called abstract class
// eg - abstract class Aeroplane

abstract class Aeroplane {
    abstract public void takeoff();
    abstract public void fly();
}

class CargoPlane extends Aeroplane {
    public void takeoff() {
        System.out.println("CargoPlane reqire longer  runway");
    }

    public void fly() {
        System.out.println("CargoPlane flies at lower height");
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

public class Abstraction1 {
    public static void main(String[] args) {
        Aeroplane ref1 = new CargoPlane();
        ref1.takeoff();
        ref1.fly();
        Aeroplane ref2 = new PassengerPlane();
        ref1.takeoff();
        ref2.fly();
    }
}