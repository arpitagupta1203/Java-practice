import java.util.Scanner;
public class _9_1_function_sum {
    public static int add(int a, int b){

        int c= a+ b; 
        System.out.print("The sum of "+a+" and "+b+" is: "+c);
        return c;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number a and b: ");
        int a=sc.nextInt();
        int b=sc.nextInt();

        add(a, b);
        sc.close();
    }
}
