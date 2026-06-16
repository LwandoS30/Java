
public class Main {
    public static void main(String[] args) {
        System.out.println( printYearsAndDays(0x3a1c1b));
    }

    public static boolean printYearsAndDays (long minutes){
        long years;
        long days;
        long hours;
        long remainingDays;
        hours =  minutes / 60;
        String invalidValue = " Invalid Value";

        if(minutes < 0){
            System.out.println(invalidValue);
        }
        else {
            days = hours / 24;
            years = days / 365;
            remainingDays = days % 365;
            System.out.println(minutes+" min = "+years+" y and " + remainingDays + " d");
        }
        return false;
    }
}