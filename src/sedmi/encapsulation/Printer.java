package sedmi.encapsulation;
// Create a class and demonstate proper encapsulation techniques
// the class will be called Printer
// It will simulate a real Computer Printer
// It should have fields for the toner Level, number of pages printed, and
// also whether its a duplex printer (capable of printing on both sides of the paper).
// Add methods to fill up the toner (up to a maximum of 100%), another method to
// simulate printing a page (which should increase the number of pages printed).
// Decide on the scope, whether to use constructors, and anything else you think is needed.

public class Printer {

    private int tonerLevel;
    private int numberOfPages;
    private boolean duplexPrint;

    public Printer(int tonerLevel, boolean duplexPrint) {
        if (tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.duplexPrint = duplexPrint;
        this.numberOfPages = 0;

    }

    public int fillToner(int toner) {
        if (toner > 0 && toner <= 100) {
            if (this.tonerLevel + toner > 100) {
                return -1;
            }
            this.tonerLevel += toner;
            return this.tonerLevel;
        } else {
            return -1;
        }
    }

    public int printingPages(int pages) {
        if (duplexPrint) {
            this.numberOfPages = (pages / 2) + (pages % 2);
            System.out.println("Printing in duplex mode");
            return numberOfPages;

        } else {
            return numberOfPages = numberOfPages + pages;
        }

    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

}
