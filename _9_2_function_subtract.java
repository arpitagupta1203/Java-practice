import java.util.Scanner;

public class _9_2_function_subtract {
    public static int minus(int a,int b){
        return a-b;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number for difference: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("The diffrence is: "+minus(a,b));

        // also----------->
        // int sub=minus(a,b);
        // System.out.println(sub);
        sc.close();
    }
}
