// 1. Enter 3 numbers from the user & make a function to print their average.

import java.util.Scanner;
public class _9_5_function_average{
    public static double avg(double a,double b,double c){
        double average= (a+b+c)/3;
        return average;
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 3 number for their average: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("The avg of 3 number is: "+avg(a,b,c));
        sc.close();
    }
}