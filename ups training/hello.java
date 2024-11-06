class Vehicle {
    public void honk() {
        System.out.println("Vehicle makes a sound");
    }
}
class Car extends Vehicle {
    @Override
    public void honk() {
        System.out.println("Car honks");
    }
}
class Motorcycle extends Vehicle {
    @Override
    public void honk() {
        System.out.println("Motorcycle revs");
    }
}

public class hello {
    public static void main(String[] args) {
        Vehicle genericVehicle = new Vehicle();
        Vehicle Motorcycle= new Motorcycle();
        genericVehicle.honk();
        Motorcycle.honk();
    }
}
