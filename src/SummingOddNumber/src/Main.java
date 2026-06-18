
public class Main {
    public static void main(String[] args) {
        System.out.println("===============================================================");
        System.out.println("\t\t\t\t\t\t\t OUTPUT");
        System.out.println("===============================================================");
        System.out.println(isOdd(-5));
        System.out.println("***************************************************************");
        System.out.println(sumOdd(1, -15));
        System.out.println("===============================================================");

    }

    public static boolean isOdd(int number){
        if(number > 0 && number % 2 == 1){
            return true;
        }
        else{
            return false;
        }
    }

    public static int sumOdd(int start, int end){

        int sum = 0;
        boolean isOddNumber;

        if(end >= start && (start > 0 && end > 0)){
            for(int i = start; i <= end; i++){
                isOddNumber = isOdd(i);
                if(isOddNumber == true){
                    sum = sum + i;
                }
            }
            return sum;
        }else{
            return -1;
        }
    }
}