package sedmi.polymorphism;


public class Peugeot extends Car{

    public Peugeot(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Peugeot start engine";
    }

    @Override
    public String brake() {
        return "Peugeot brake";
    }

    @Override
    public String accelerate() {
        return "Peugeot accelerate";
    }
    
}
