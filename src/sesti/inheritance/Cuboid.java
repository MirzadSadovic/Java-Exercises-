package sesti.inheritance;

public class Cuboid extends Rectangle {

    private double height;

    public Cuboid(double width, double legth, double height) {
        super(width, legth);
        this.height = height < 0 ? 0 : height;
    }

    public double getHeight() {
        return height;
    }
    public double getVolume(){
        return getArea() * height;
    }

}
