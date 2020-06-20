package peti;

public class TheForStatement {

    public static void main(String[] args) {
        System.out.println(isPrime(2));

        for (int i = 0; i < 5; i++) {
            System.out.println("Loop " + i + " hello");
        }
        for (int i = 2; i <= 8; i++) {
            System.out.println(calculateInterest(10000.0, i));
        }
        for (int i = 8; i >= 2; i--) {
            System.out.println(calculateInterest(10000.0, i));
        }
    }

    public static double calculateInterest(double amount, double interestRate) {

        return (amount * (interestRate / 100));
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
