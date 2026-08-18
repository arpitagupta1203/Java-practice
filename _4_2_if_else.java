import java.util.Scanner;
public class _4_2_if_else{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number1: ");
        int a = sc.nextInt();
        System.out.println("Enter number2: ");
        int b = sc.nextInt();
        if(a>b){
            System.out.println(a+" is greater than "+b);
        }
        else if(a<b){
            System.out.println(b+" is greater than "+a);
        }
        else{
            System.out.println(a+" is equal to "+b);
        }        
        sc.close();
    }
}