package cetvrti;

public class Methods {

    public static void main(String[] args) {
        calculateScore(true, 800, 5, 100);//poziv metode na dole u main funkciji
        int highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score was " + highScore);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        /*boolean gameOver = true;
         int score = 800;
         int levelCompleted = 5;
         int bonus = 100; */  //nisu potrebni parametri ako kreiramo metodu koju cemo pozvati u main metodi, i pozivom joj dodijeliti parametre

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }

}
