
public class Main {
    public static void main(String[] args) {

        System.out.println("Is the person tean: " + hasTeen(77, 16, 12));
        System.out.println("Is the person tean: " + isTeen(17));
    }
    public static boolean hasTeen (int age1, int age2, int age3){

        if((age3 < 13 || age2 < 13 || age1 < 13)
                &&(age3 > 19 || age2 > 19 || age1 > 19)) {
            return false;
        }

        if((age1 >= 13 || age2 >= 13 || age3 >= 13)
                && (age1 <= 19 || age2 <= 19 || age3 <= 19)){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean isTeen (int teen){
        if(teen >= 13 && teen <= 19){
            return true;
        }
        else{
            return false;
        }
    }
}