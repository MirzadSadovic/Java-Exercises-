package sesti.inheritance;

public class Fish extends Animal{
    
    private int gills;
    private int eyes;
    private int fins;

    public Fish(int gills, int eyes, int fins, String name, int brain, int body, int size, int weight) {
        super(name, brain, body, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }
    
    private void rest(){
        
    }
    private void moveMuscles(){
        
    }
    private void moveBackFin(){
        
    }
    private void swim(int speed){
        moveMuscles();
        moveBackFin();
        super.move(speed);
    }
}
