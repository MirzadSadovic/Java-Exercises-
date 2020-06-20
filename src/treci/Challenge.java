package treci;
//Operator Challenge

public class Challenge {

    public static void main(String[] args) {
        double number = 20.0d;
        double number1 = 80.0d;
        double result = (number + number1) * 100.0d;
        System.out.println("Result is = " + result);
        double remainder = result % 45.0d;
        System.out.println("Remainder is = " + remainder);
        boolean variable = (remainder == 0) ? true : false;
        System.out.println("Variable = " + variable);
        if (!variable) {
            System.out.println("Got some remainder");
        }
    }
}
