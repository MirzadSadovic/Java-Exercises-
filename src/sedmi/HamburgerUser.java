package sedmi;

public class HamburgerUser {

    public static void main(String[] args) {

        Hamburger hamburger =  new Hamburger("Classic", "White bread", "Beef", 5.0);
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAdition1("tomato", 0.27);
        hamburger.addHamburgerAdition2("Lettuce", 0.27);
        hamburger.addHamburgerAdition3("cheese", 0.27);
        System.out.println(price);
        
        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHamburgerAdition1("Egg", 5.4);
        healthyBurger.addHealtyAddition1("Lentils", 3.41);
        System.out.println(healthyBurger.itemizeHamburger());
        
        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.addHamburgerAdition1("tomato", 1.0);
        System.out.println(deluxeBurger.itemizeHamburger());
        
        
        
    }
}
