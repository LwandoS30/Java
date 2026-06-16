
public class Main {
    public static void main(String[] args) {
        char switchValue = 'Z';

        switch (switchValue){
            case 'A' -> {
                System.out.println("Able");
            }
            case 'B' -> {
                System.out.println("Baker");
            }
            case 'C' -> {
                System.out.println("Charlie");
            }
            case 'D' -> {
                System.out.println("Dog");
            }
            case 'E' -> {
                System.out.println("Easy");
            }
            default -> {
                System.out.println(switchValue + " was not found in the switch statement");
            }
        }
    }

}