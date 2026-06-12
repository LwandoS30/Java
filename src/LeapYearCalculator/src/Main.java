public class Main{
    public  static void main(String[] args){
        System.out.println(isLeapYear(-2050));
    }

    public static boolean isLeapYear(int year){
        final int leapYearDays = 366;
        final int notLeapYearDays = 365;
        int isLeapYeah;

        if(year >= 1 && year <= 9999){
            if(year % 4 == 0) {
                System.out.println(year + " It is leap year because it is divisible by 4");
                if (year % 100 == 0){
                    System.out.println(year + " It is leap year because it is divisible by 100");
                    if( year % 400 == 0){
                        System.out.println(year + " It is leap year because it is divisible by 400");
                        return true;
                    }
                    else {
                        return false;
                    }
                }
                else {
                    return true;
                }
            }
            else{
                System.out.println(year + " Is not a leap year");
                return false;
            }
        }
        else{
            return false;
        }
    }
}