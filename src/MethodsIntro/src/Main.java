//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Below is the method called!!!");
        calculateScore(20000, true, 10, 100);
        int sum = calculateSum(44, 17);
        System.out.println(sum);
        System.out.println(isTooOld(sum));

        System.out.println("==========================================================================");
        System.out.println(displayHighScorePosition("Lwando", 4));
        System.out.println("==========================================================================");
        System.out.println("++++++++++++++++++++++++++++++++++=+++++++++++++++++++++++++++++++++++++++");
        System.out.println(displayHighScorePosition("Lwando", 4));
        System.out.println(calculateHighScorePosition(100));

        System.out.println(displayHighScorePosition("Siso", 2));
        System.out.println(calculateHighScorePosition(400));

        System.out.println(displayHighScorePosition("Mandy", 1));
        System.out.println(calculateHighScorePosition(8000));

        System.out.println(displayHighScorePosition("Yolanda", 3));
        System.out.println(calculateHighScorePosition(700));
        ;System.out.println("++++++++++++++++++++++++++++++++++=+++++++++++++++++++++++++++++++++++++++");
    }

    public static void calculateScore(int score, boolean gameOver, int levelCompleted, int  bonus){
        int finalScore = score;
        if (gameOver){
            finalScore += levelCompleted * bonus;
            System.out.println("The new final score in a new method is: "+finalScore);
        }
    }

    public static int calculateSum(int num1, int num2){
        int sumValues;
        return sumValues = num1 + num2;
    }

    public static boolean isTooOld(int age){
        boolean boolValue = false;
        if(age > 21){
            boolValue = true;
        }
        return boolValue;
    }

    public static boolean displayHighScorePosition(String name, int playerPosition){
        System.out.println(name+" maneged to get into "+playerPosition+" on the high score list");
        return false;
    }

    public static int calculateHighScorePosition(int playerScore){
        int scorePosition;
        if (playerScore >= 1000){
            scorePosition = 1;
            System.out.println("Option 1: "+scorePosition);
        }
        else if (playerScore >= 500) {
            scorePosition = 2;
            System.out.println("Option 2: "+scorePosition);
        }
        else if (playerScore >= 100) {
            scorePosition = 3;
            System.out.println("Option 3: "+scorePosition);
        }
        else {
            scorePosition = 4;
            System.out.println("Option 4: "+scorePosition);
        }

        return scorePosition;
    }
}