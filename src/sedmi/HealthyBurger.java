package sedmi;

public class HealthyBurger extends Hamburger {

    private String healtyExtra1Name;
    private double healtyExtra1Price;

    private String healtyExtra2Name;
    private double healtyExtra2Price;

    public HealthyBurger(String maeat, double price) {
        super("HealtyBurger", "Brown rye", maeat, price);

    }

    public void addHealtyAddition1(String name, double price) {
        this.healtyExtra1Name = name;
        this.healtyExtra1Price = price;
    }

    public void addHealtyAddition2(String name, double price) {
        this.healtyExtra2Name = name;
        this.healtyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger();
        if (this.healtyExtra1Name != null) {
            hamburgerPrice += healtyExtra1Price;
        }
        if (this.healtyExtra2Name != null) {
            hamburgerPrice += healtyExtra2Price;
        }
        return hamburgerPrice;
    }

}
