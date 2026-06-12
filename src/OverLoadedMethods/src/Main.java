public class Main {
    public static void main(String[] args) {
        System.out.println("The centimeters of the provided inches are: "
                + convertToCentimeters(68) +"cm");
        System.out.println("And the total number of inches in centimeters are: "
                + convertToCentimeters(5, 8)+"cm");
    }

    public static double convertToCentimeters(int heightInInches){
        double numCentimeters;
        final double centToInches = 2.54;

        numCentimeters = (heightInInches * centToInches);
        return numCentimeters;
    }

    public static double convertToCentimeters(int heightInFeet, int heightRemainderInInches){

        double numCentimeters;
        int feetToInche = 12;

        int totalInches = (heightInFeet * feetToInche) + heightRemainderInInches;
        numCentimeters = convertToCentimeters(totalInches);

        return numCentimeters;
    }
}