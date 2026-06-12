
public class Main {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(10.210, 10.210));
    }

    public static boolean areEqualByThreeDecimalPlaces(double fDoubleValue, double sDoubleValue) {
        long fValue = (long) (fDoubleValue * 1000);
        long sValue = (long) (sDoubleValue * 1000);

        return fValue == sValue;

    }
}