package sedmi.polymorphism;

public class CarUser {

    public static void main(String[] args) {

        Car car = new Car("Car", 8);
        System.out.println(car.startEngine() + ": " + car.accelerate() + ": " + car.brake());
        
        Renault renault = new Renault("Laguna", 6);
        System.out.println(renault.startEngine() + ": " + renault.accelerate() + ": " + renault.brake());
        
        Peugeot peugeot = new Peugeot("206", 6);
        System.out.println(peugeot.startEngine() + ": " + peugeot.accelerate() + ": " + peugeot.brake());
    }

}
