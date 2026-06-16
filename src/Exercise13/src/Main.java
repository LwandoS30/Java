
public class Main {
    public static void main(String[] args) {
        System.out.println(printNumberInWord(7));
    }
    public static boolean printNumberInWord(int number){
        String yieldNumber;

        switch(number){
            case 0 -> {
                yieldNumber = "ZERO";
                System.out.println(yieldNumber);
            }
            case 1 -> {
                yieldNumber = "ONE";
                System.out.println(yieldNumber);
            }
            case 2 -> {
                yieldNumber = "TWO";
                System.out.println(yieldNumber);
            }
            case 3 -> {
                yieldNumber = "THREE";
                System.out.println(yieldNumber);
            }
            case 4 -> {
                yieldNumber = "FOUR";
                System.out.println(yieldNumber);
            }
            case 5 -> {
                yieldNumber = "FIVE";
                System.out.println(yieldNumber);
            }
            case 6 -> {
                yieldNumber = "SIX";
                System.out.println(yieldNumber);
            }
            case 7 -> {
                yieldNumber = "SEVEN";
                System.out.println(yieldNumber);
            }
            case 8 -> {
                yieldNumber = "EIGHT";
                System.out.println(yieldNumber);
            }
            case 9 -> {
                yieldNumber = "NINE";
                System.out.println(yieldNumber);
            }
            default -> {
                yieldNumber = "OTHER";
                System.out.println(yieldNumber);
            }

        }
        return false;
    }
}