
public class Main {
    public static void main(String[] args) {

        System.out.println("The area of a circle is: " + area(4));
        System.out.println("The area of a Rectangle is: " + area(8, 8));
    }
    public static double area(double radius){
        double invalidValue = -1.0;
        double area;

        if(radius < 0){
            return invalidValue;
        }
        else{
            return area = Math.PI * radius * radius;
        }
    }

    public static double area(double x, double y){
        double invalidValue = -1.0;
        double area;

        if(x < 0 || y < 0){
            return invalidValue;
        }
        else{
            return area = x * y;
        }
    }
}