// Write a function which takes in 2 numbers and returns the greater of those two.

import java.util.Scanner;

public class _9_7_function_greater_number {

    public static void greater(int a,int b){
        if(a>b){
            System.out.println(a+" is grater than "+b);
        }
        else{
            System.out.println(b+" is greater than "+a);
        }
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        greater(a,b);
        sc.close();
    }
    
}
