package treci;

public class IfThenStatement {

    public static void main(String[] args) {

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It in not an alien!");
            System.out.println("And I am scared of aliens.");
        }
        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }
        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greather than second top score and less than 100");
            // nece biti ispisa, nisu zadovoljena oba uslova
        }
        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both conditions are true");

        }
        if (!(topScore == 80)) {
            System.out.println("Number is not equals");
        }
        boolean isCar = false;
        if (isCar) {
            System.out.println("This is not supposted tu happen");

        }
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");

        }

    }

}


