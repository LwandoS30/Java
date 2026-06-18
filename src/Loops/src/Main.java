
public class Main {
    public static void main(String[] args) {
        int sum = 0, counter = 0;
        int counterIsDivisibleByThree = 0;
        for(int number = 100; number > 0; number-=9){
            System.out.println(number);
            //number = number - 3;
            if(number % 3 == 1){
                System.out.println(number);
                counterIsDivisibleByThree++;
                System.out.println("Counter is: " + counterIsDivisibleByThree);
            }
            if(number == 15){
                break;
            }
        }

        for (int i = 1; i <= 1000; i++){
            if((i % 3 == 0) && (i % 5 == 0)){
                System.out.println(i);
                sum = sum + i;
                counter++;
            }
            if (counter == 5){
                break;
            }

        }
        System.out.println("=================================================================================================");
        System.out.println("\t\t\tNumbers that are divisible by 3 and 5 make the total of: "+ sum + " they are: " + counter);
        System.out.println("=================================================================================================");
        System.out.println("*************************************************************************************************");
        System.out.println("=================================================================================================");
        System.out.println("\t\t\t\t\t\t\t\t\t\tIS PRIME BELOW");
        System.out.println("=================================================================================================");
        isPrime(99);
    }

    public static boolean isPrime(int maxNumber){
        int counter = 0;
        for (int i = 0; i <= maxNumber; i++){
            if(i % 2 == 1){
                System.out.println(i);
                counter++;
            }

            if(counter == 3){
                break;
            }

        }
        return false;
    }
}