package drugi;

public class ObjektniTipString {

    public static void main(String[] args) {
        //PRIMITIVNI TIPOVI PODATAKA U JAVI
        //byte
        //short
        //int
        //long
        //float
        //double
        //char
        //boolean

        //OBJEKTNI Tip 
        String myString = "This is a string";
        String numberString = "250.55";
        numberString = numberString + "249.45";
        System.out.println(numberString);
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is equal " + lastString);
        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("LastString is equal " + lastString);
    }
}
