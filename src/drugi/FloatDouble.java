package drugi;

public class FloatDouble {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;
        System.out.println("Int = " + myIntValue);
        System.out.println("Float = " + myFloatValue);
        System.out.println("Double = " + myDoubleValue);

        //Challange
        double pound = 5.00d;
        double kilogram = pound * 0.45359237;
        System.out.println("Konvertavano u kilograme = " + kilogram);
    }

}
