package sedmi.polymorphism;


public class Renault extends Car{

    public Renault(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Laguna start engine"; 
    }

    @Override
    public String brake() {
        return "Laguna brake"; 
    }

    @Override
    public String accelerate() {
        return "Laguna accelerate "; 
    }
    
}
