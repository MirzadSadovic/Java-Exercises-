package sedmi.encapsulation;

public class EnhancedPlayer {

    private String name;
    private int hitPoint = 100; //healt renamed into hitPoint becau
    private String weapon;

    public EnhancedPlayer(String name, int healt, String weapon) {
        this.name = name;
        if (healt > 0 && healt <= 100) {
            this.hitPoint = healt;
        }

        this.weapon = weapon;
    }

    public void loseHealt(int demage) {
        this.hitPoint = this.hitPoint - demage;
        if (this.hitPoint <= 0) {
            System.out.println("Player konocked out");
            //Reduce number of lives remaining for the player
        }
    }

    public int getHealt() {
        return hitPoint;
    }

}
