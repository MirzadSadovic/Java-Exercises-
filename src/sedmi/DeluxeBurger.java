package sedmi;


public class DeluxeBurger extends Hamburger{

    public DeluxeBurger() {
        super("Deluxe", "White", "Bacon", 14.54);
        super.addHamburgerAdition1("Chips", 2.0);
        super.addHamburgerAdition2("Coca Cola", 3.0);
    }

    @Override
    public void addHamburgerAdition4(String name, double price) {
        System.out.println("Cannot add additional itmes to a deluxe burger");
    }

    @Override
    public void addHamburgerAdition3(String name, double price) {
        System.out.println("Cannot add additional itmes to a deluxe burger");
    }

    @Override
    public void addHamburgerAdition2(String name, double price) {
        System.out.println("Cannot add additional itmes to a deluxe burger");
    }

    @Override
    public void addHamburgerAdition1(String name, double price) {
        System.out.println("Cannot add additional itmes to a deluxe burger");
    }
    
    
    
    
    
    
}
