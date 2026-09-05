import java.util.Scanner;
public class _9_4_1_function_factorial {
    public static void printFact(int n){

        if(n<0){
            System.out.println("Invalid! ");
            return;
        }

        int fact=1;
        for(int i=1;i<=n;i++){
            fact = fact*i;
        }
        System.out.println(fact);
        return;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        printFact(n);
        sc.close();
    }
}
