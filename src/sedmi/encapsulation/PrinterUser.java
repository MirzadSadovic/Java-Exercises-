package sedmi.encapsulation;

import sedmi.encapsulation.Printer;


public class PrinterUser {
    
    public static void main(String[] args) {
        
       Printer printer = new Printer(50, true);
        System.out.println("Initial page count = "+ printer.getNumberOfPages());
        printer.printingPages(4);
        System.out.println("Number of printed pages is " + printer.getNumberOfPages());
        System.out.println("Level of toner is "+ printer.fillToner(40));
        
    }
}
