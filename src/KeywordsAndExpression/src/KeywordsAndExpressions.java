public class KeywordsAndExpressions{
    public static  void main(String[] args){
        //Expressions below
        double kilometer = (100 * 1.609344);
        System.out.println("The kilometers of 100 mile is: "+kilometer+"km");

        int highScore = 50;
        if (highScore > 25){
            highScore = highScore + 1000; //add bonus points
            System.out.println("High score with added bonus point is: "+ highScore+"kg");
        }

        //Identify expressions on the following code
        int health = 100; //expression

        if((health > 25) && (highScore > 1000)){ //expression 3
            highScore = highScore - 1000; //expression 2
            health = health -25; //expression 2
            System.out.println("New high score is: "+highScore+"-HS and health is: "+ health+" Healthy");
        }
    }
}