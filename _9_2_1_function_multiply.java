import java.util.Scanner;

public class _9_2_1_function_multiply {
    public static int multi(int a,int b){
        return a*b;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a and b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int product=multi(a,b);
        System.out.println("Product is: "+product);
        sc.close();
    }
}
