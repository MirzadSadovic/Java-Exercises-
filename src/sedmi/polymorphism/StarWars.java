package sedmi.polymorphism;


public class StarWars extends Movie{

    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial Forces try to take over universe";
    }
    
}
