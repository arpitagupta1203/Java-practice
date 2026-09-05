// Write a function to print the sum of all odd numbers from 1 to n.

import java.util.Scanner;
public class _9_6_Function_odd_number_sum {
    public static int oddNumberSum(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                sum=sum+i;
            }
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        System.out.println("The sum of all odd numbers from 1 to "+n+" is: "+oddNumberSum(n));
        sc.close();
            
    }
}
