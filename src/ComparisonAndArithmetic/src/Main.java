
public class Main {
    public static void main(String[] args) {
        System.out.println( hasEqualSum(5, 16, 21));

    }

    public static boolean hasEqualSum(int fInt, int sInt, int finalSum){
        int localSum = fInt + sInt;

        if(localSum == finalSum){
            return true;
        }
        else{
            return false;
        }
    }
}