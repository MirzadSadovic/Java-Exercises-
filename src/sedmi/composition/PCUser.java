package sedmi.composition;

public class PCUser {

    public static void main(String[] args) {

        Dimensions dinmension = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "220", dinmension);
        
        Resolution nativeResolution = new Resolution(2540, 1440);
        Monitor theMonitor = new Monitor("27 inch", "Acer", 27, nativeResolution);
        
        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");
        
        //primjer 1
        PC thePc = new PC(theCase, theMonitor, theMotherboard);
        thePc.getTheCase().pressPowerButtor();              //pozivanje funkcija sa geterima
        thePc.getMonitor().drawPixelAt(1500, 1200, "red");  //pozivanje funkcija sa geterima
        thePc.getMotherboard().loadProgram("Windows 10");   //pozivanje funkcija sa geterima
        
        System.out.println("");
        
        //primjer 2
        thePc.powerUp(); //pozivanje public funkcije powerUp,koja sadrzi svoje privatne funkcije u PC klasi 
    }
}
