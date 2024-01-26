//polymorphism in java

class Aeroplane {
    public void takeoff() {
        System.out.println("Aeroplane is taking off");
    }

    public void fly() {
        System.out.println("Aeroplane is flying");
    }
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

public class polymorphism1 {
    public static void main(String[] args) {
        CargoPlane cp = new CargoPlane();
        PassengerPlane pp = new PassengerPlane();
        Aeroplane ref;
        ref = cp;
        ref.takeoff();
        ref.fly();
        System.out.println("--------------------------------------");
        ref = pp;
        ref.takeoff();
        ref.fly();
    }
}
