public class Main {
    public static void main(String[] args) {
        System.out.println(printDayOfTheWeek(2));
        System.out.println(printWeekDay(9));
    }

    public static boolean printDayOfTheWeek(int day){
         switch (day){
            case 0 -> {
                System.out.println("0 is Sunday");}
            case 1 -> {
                System.out.println("1 is Monday");}
            case 2 -> {
                System.out.println("2 is Tuesday");}
            case 3 -> {
                System.out.println("3 is Wednesday");}
            case 4 -> {
                System.out.println("4 is Thursday");}
            case 5 -> {
                System.out.println("5 is Friday");}
            case 6 -> {
                System.out.println("6 is Saturday");}

            default -> {
                System.out.println(day+" is not a valid day entered");}
        };
        return false;
    }

    public static int printWeekDay(int day){

        if(day == 0){
            System.out.println("0 is Sunday");
        }
        else if(day == 1){
            System.out.println("1 is Monday");
        }
        else if(day == 2){
            System.out.println("2 is Tuesday");
        }
        else if(day == 3){
            System.out.println("3 is Wednesday");
        }
        else if(day == 4){
            System.out.println("4 is Thursday");
        }
        else if(day == 5){
            System.out.println("5 is Friday");
        }
        else if(day == 6){
            System.out.println("6 is Saturday");
        }
        else{
            System.out.println(day + " day is not a valid day");
        }
        return day;
    }
}