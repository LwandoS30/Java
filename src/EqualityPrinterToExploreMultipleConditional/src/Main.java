
public class Main {
    public static void main(String[] args) {

        System.out.println(printEqual(44, 66, 77));
    }

    public static boolean printEqual(int value1, int value2, int value3){
        if(value1 < 0 || value2 < 0 || value3 < 0){
            System.out.println("Invalid Value");
        }
        else if (value1 == value2 && value2 == value3 && value1 == value3){
            System.out.println("All numbers are equal");
        }
        else if (value1 != value2 && value2 != value3 && value1 != value3){
            System.out.println("All numbers are different");
        }
        else{
            System.out.println("Neither all are equal or different");
        }
        return false;
    }
}