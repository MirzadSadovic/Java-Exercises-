/*
 -Read 10 numbers from the console entered by the user and print the sum of those numbers.
 -Create a Scanner like we did in the previous video.
 -Use the hasNextInt() method from the scanner to check if the user has entered an int value.
 -If hasNextInt() returns false, print the message "Invalid Number". Continue reading until you have read 10 numbers.
 -Use the nextInt() method to get the number and add it to the sum.
 -Before the user enters each number, print the message "Enter number #x:" where x represents the count, i.e. 1, 2, 3, 4, etc.
 -For example, the first message printed to the user would be "Enter number #1:", the next "Enter number #2: ", and so on.

 Hint: 
 -Use a while loop.
 -Use a counter variable for counting valid numbers.
 -Close the scanner after you donft need it anymore.
 -Create a project with the name ReadingUserInputChallenge.

 */
package peti;

import java.util.Scanner;

public class ReadingUserInputChallenge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int counter = 1;
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter number #" + counter + ": ");
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                counter++;
                sum += number;

            } else {
                System.out.println("Invalid Number");
                scanner.nextLine();
            }
        }
        System.out.println("Sum of all numbers = " + sum);
        scanner.close();
    }
}
