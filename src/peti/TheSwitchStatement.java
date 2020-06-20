package peti;

public class TheSwitchStatement {

    public static void main(String[] args) {

        int switchValue = 0;
        
        switch(switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("was a 3, or a 4, or a 5");
                System.out.println("Actually is " + switchValue);
                break;
                
                default:
                    System.out.println("Was not 1, 2, 3, 4 or 5");
                    break;
                    
        }
        // switsh case with String
        String month = "JANUARY";
        switch(month.toLowerCase()){ // metoda to.LowerCase ili to.UpperCase
            case "january":
                System.out.println("Januar");
                break;
            case "june":
                System.out.println("Jun");
                break;
                
                default:
                    System.out.println("Unesen netačan mjesec");
                    break;
                
        }
    }

}
