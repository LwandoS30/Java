//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    boolean gameOver;
    int score;
    int levelCompleted;
    int bonus;

    public static void main(String[] args) {
        Main obj = new Main();

        obj.gameOver = true;
        obj.score = 3000;
        obj.levelCompleted = 5;
        obj.bonus = 100;

        if(obj.score < 5000 && obj.score > 1000){
            System.out.println("Your score is "+obj.score);
        }
        else if(obj.score < 1000) {
            System.out.println("Your score is less than 1000, indeed!");
        }
        else {
            System.out.println("Got here");
        }

        if(obj.gameOver){
            System.out.println("Game over");
        }

        obj.score = 10000;
        obj.levelCompleted = 8;
        obj.bonus = 200;

        int finalScore = obj.score;
        if (obj.gameOver){
            finalScore = finalScore + obj.bonus * obj.levelCompleted;
            System.out.println("The final score is: "+finalScore);
        }
    }
}