//polymorphism in java
// runtime polymorphism 

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

class Airpot {
    public void polymorphism(Aeroplane ref) {
        ref.takeoff();
        ref.fly();
        System.out.println("-----------------------------------");
    }
}

public class polymorphism2 {
    public static void main(String[] args) {
        CargoPlane cp = new CargoPlane();
        PassengerPlane pp = new PassengerPlane();
        Airpot a = new Airpot();
        a.polymorphism(cp);
        a.polymorphism(pp);
    }
}