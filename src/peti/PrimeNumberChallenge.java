package peti;

// Create a for statement using any range of numbers
// Determine if the number is a prime number using the isPrime method
// if it is a prime number, print it out AND increment a count of the
// number of prime numbers found
// if that count is 3 exit the for loop
// hint:  Use the break; statement to exit
public class PrimeNumberChallenge {

    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i < 10; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println("Prime number is: " + i);
                if (count == 3) {
                    break;
                }
            }

        }
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            System.out.println("For lop = "+ i);
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }
}
