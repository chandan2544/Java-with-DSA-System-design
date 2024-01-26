//types of methods in inheritance 
// 1.inherited method 
// 2.overriden method
// 3.specialized method

//inherited method which is not modified by the child class directly used

class Aeroplane{
    public void takeoff(){
        System.out.println("Aeroplane is taking off");
    }
    public void fly(){
        System.out.println("Aeroplane is flying ");
    }
}

class CargoPlane extends Aeroplane{

}

class PassengerPlane extends Aeroplane{

}

public class TypeOfMethods_inheritance {
    public static void main(String[] args) {
        CargoPlane cp=new CargoPlane();
        cp.takeoff();
        cp.fly();
        PassengerPlane pp=new PassengerPlane();
        pp.takeoff();
        pp.fly();
    }
}
