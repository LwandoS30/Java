//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        printMegaBytesAndKiloBytes(2048);
        shouldWakeUp(false, 7);
    }
    public static void printMegaBytesAndKiloBytes(int kiloByte){
        //double KiloByteToMegaByte = 0.001;
        final int oneMegaIsKilo = 1024;
        int kiloByteReminder;
        int mega;

        if(kiloByte < 0){
            System.out.println("Invalid Value");
        }
        else{
            mega = kiloByte / oneMegaIsKilo;
            kiloByteReminder = kiloByte % oneMegaIsKilo;
            System.out.println(kiloByte +" KB = "+ mega +" MB and "+kiloByteReminder+" KB");
        }
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){

        if(barking == true && hourOfDay < 8 || hourOfDay > 22){
            //System.out.println("Wake up, the dog is barking: "+barking);
            return barking;
        }else{
            //System.out.println("The dog is not barking: "+barking);
            return barking;
        }
    }

    public static long toMilesPerHour(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            return -1;
        }
        return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
            return;
        }
        long milesPerHour = toMilesPerHour(kilometersPerHour);
        System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
    }

}