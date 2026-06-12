public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Lwando\n");

        boolean isOld = true;
        if(isOld == true){
            System.out.println("This person is younger than 18");
        }
        else {
            System.out.println("This person is older than 18");
        }

        int topScore = 89;
        if(topScore >= 90){
            System.out.println("You got the high score of "+topScore);
        } else {
            System.out.println("Top scorer is "+topScore);
        }

        int secTopScore =  60;
        if(topScore > secTopScore && topScore < 100){
            System.out.println("Greater than second top and less 100");
        }


         secTopScore =  90;
        if(topScore > secTopScore || topScore < secTopScore){
            System.out.println("Greater than second top and less 100");
        }

        int newValue = 7;
        if(newValue == 7){
            System.out.println("\n No error found");
        }

        boolean isCar = false;
        if(isCar == true){
            System.out.println("This does not supposed to happen!");
        }


        String makeOfCar = "Volkswagen";
        //shortcut of an if-else statement
        boolean isDomestic = makeOfCar == " Volkswagen" ? false : true;
        System.out.println("The out of is Domestic is: "+isDomestic);
//
//        if(makeOfCar == " Volkswagen" ){
//            isDomestic = false;
//            System.out.println(isDomestic);
//        }
//        else {
//            isDomestic = true;
//            System.out.println(isDomestic);
 //       }

        double fDouble = 20.00;
        double sDouble = 80.00;
        double addDouble = fDouble + sDouble * 100;

        double remainder = addDouble % 40;
        System.out.println(remainder+"\n");

        boolean isTrue = true;
        if (remainder == 0.00){
            System.out.println(remainder + " == 0.00");
        }else {
            System.out.println(remainder + " is not == 0.00");
        }

        /*java have 51 keywords
        * Even an underscore is a keyword
        *
        * */
    }
}