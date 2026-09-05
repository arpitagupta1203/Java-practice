import java.util.Scanner;

public class _9_4_function_factorial {
    public static int factorial(){
        
        Scanner sc=  new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();

        sc.close();
        
        int fact=1;
        for(int i=1;i<=a;i++){
            fact = fact*i;
        }
        return fact;
        
    }

    public static void main(String[] args){
        System.out.println("The factorial is: "+factorial());
        
    }
}
