
public class Main {
    private static String month;

    public static void main(String[] args) {
        getQuarter("January");
        System.out.println();
    }

    public  static  String getQuarter(String month){
        Main.month = month;

        return switch (month) {
            case "January", "February", "March" -> "1st";
            case "April", "May", "June" -> "2nd";
            case "July", "August", "September" -> "3rd";
            case "October", "November", "December" -> "4th";
            default -> "Bad request month";
        };
    }
}