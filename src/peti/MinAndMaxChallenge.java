package peti;

import java.util.Scanner;

public class MinAndMaxChallenge {

    public static void main(String[] args) {
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter number");
            
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                
                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }

            } else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("min = " + min + "," + " max = " + max);

        scanner.close();
    }
}
