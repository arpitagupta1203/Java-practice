// Write a function that takes in the radius as input and returns the circumference of a circle.
import java.util.Scanner;

public class _9_8_function_circle_circumference {
    public static double circum(double r){
        double circumference=Math.PI*2*r;
        return circumference;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter radius: ");
        double r=sc.nextInt();
        System.out.println("the circumference of circle is: "+circum(r));
        sc.close();
    }
}
