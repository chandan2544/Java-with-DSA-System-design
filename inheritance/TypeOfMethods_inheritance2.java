// 2. overriden method - are those who is modified method from inherited class 

class Aeroplane {
    public void takeoff() {
        System.out.println("Aeroplane is taking off");
    }

    // overriden method in parent class
    public void fly() {
        System.out.println("Aeroplane is flying ");
    }
}

class CargoPlane extends Aeroplane {
    // overriding method in child class
    public void fly() {
        System.out.println("CargoPlane is flying at low");
    }
}

class PassengerPlane extends Aeroplane {
    // overriding method in child class
    public void fly() {
        System.out.println(" PassengerPlane is flying at medium height ");
    }
}

public class TypeOfMethods_inheritance2 {
    public static void main(String[] args) {
        CargoPlane cp = new CargoPlane();
        cp.takeoff();
        cp.fly();
        PassengerPlane pp = new PassengerPlane();
        pp.takeoff();
        pp.fly();
    }
}
