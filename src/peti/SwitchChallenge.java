package peti;
// Create a new switch statement using char instead of int
// create a new char variable
// create a switch statement testing for
// A, B, C, D, or E
// display a message if any of these are found and then break
// Add a default which displays a message saying not found

public class SwitchChallenge {

    public static void main(String[] args) {

        char newChar = 'E';

        switch (newChar) {
            case 'A':
                System.out.println("It was A");
                break;
            case 'B':
                System.out.println("It was B");
                break;
            case 'C':
            case 'D':
            case 'E':
                System.out.println("It was " + newChar);
                break;

            default:
                System.out.println("A,B,C,D,E was not type");
                break;

        }
    }
}
