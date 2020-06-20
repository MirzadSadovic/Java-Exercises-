package cetvrti;

public class MethodOverloadingChallenge {

    public static void main(String[] args) {
        calcFeetAndInchesToCentimetres(7, 5);
        calcFeetAndInchesToCentimetres(100);
    }

    public static double calcFeetAndInchesToCentimetres(double feet, double inches) {
        if ((feet < 0) || (inches < 0 || inches > 12)) {
            System.out.println("Invalid feet or inches parameters");
            return -1;
        }
        double centimeters = (feet * 12) * 2.54;
        centimeters = centimeters + (inches * 2.54);
        System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
        return centimeters;

    }

    public static double calcFeetAndInchesToCentimetres(double inches) {
        if (inches < 0) {
            return -1;
        }
        double feet = (int)inches /12; //konverzija u int zbog zaokruzivanja, odnosno izbjegavanja decimale, zbog tacnog ispisa
        double remainingInches = (int)inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
        return calcFeetAndInchesToCentimetres(feet, remainingInches);

    }
}
