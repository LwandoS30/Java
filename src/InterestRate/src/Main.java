
public class Main {
    public static void main(String[] args) {
        double amountToBePaid;
        double amountDue = 100;
        int count = 0;
        for(double rate = 7.5; rate <= 10.0; rate = rate + 0.25){
            amountToBePaid = (amountDue * (rate / 100));
            count++;
            System.out.println(count + " - The interest of 100 with a rate of "
                    + rate + " and the pay out amount is: " + (amountDue + amountToBePaid));
        }
    }
}