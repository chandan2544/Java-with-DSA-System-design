// 3.specialized method in inheritance 
// are those methods which are present in child class but not present in parent class  

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
    public void CarryGoods() {
        System.out.println("CargoPlane carries goods");
    }
}

class PassengerPlane extends Aeroplane {
    // overriding method in child class
    public void fly() {
        System.out.println(" PassengerPlane is flying at medium height ");
    }
    public void CarryPassenger() {
        System.out.println("PassengerPlane carries passengers");
    }
}

public class TypeOfMethods_inheritance3 {
    public static void main(String[] args) {
        CargoPlane cp = new CargoPlane();
        cp.takeoff();
        cp.fly();
        cp.CarryGoods();
        PassengerPlane pp = new PassengerPlane();
        pp.takeoff();
        pp.fly();
        pp.CarryPassenger();
    }
}
