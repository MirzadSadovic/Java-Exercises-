package sedmi.encapsulation;

import sedmi.encapsulation.EnhancedPlayer;

public class EnhancedPlayerExecutor {

    public static void main(String[] args) {

        EnhancedPlayer player = new EnhancedPlayer("Mirzad", 50, "Sword");
        System.out.println("Initial healt is " + player.getHealt());
    }
}
