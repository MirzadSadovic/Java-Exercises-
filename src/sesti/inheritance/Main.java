package sesti.inheritance;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("Animal", 1, 1, 5, 5);
        Dog dog = new Dog("Yorkie", 1, 1, 8, 20, 2, 4, 1, 20, "long silky");
        dog.eat();
        dog.walk();
        dog.run();

        System.out.println("");
        //Vehicle
        Outlander outlander = new Outlander(36, 4, 5, 6, false, 0, null, null, 0, 0);
        outlander.steer(45);
        outlander.accelerate(30);
        outlander.accelerate(30);
        outlander.accelerate(-48);

        System.out.println("");
        //Circle
        Circle circle = new Circle(3.75);
        System.out.println("Circle radius = " + circle.getRadius());
        System.out.println("Circle.area = " + circle.getArea());
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("Cylinder.radius = " + cylinder.getRadius());
        System.out.println("Cylinder.height = " + cylinder.getHeight());
        System.out.println("Cylinder.area = " + cylinder.getArea());
        System.out.println("Cylinder.volume = " + cylinder.getVolume());
        
        System.out.println("");
        //Pool area
        
    }
}
