// sum of first n natural numbers
import java.util.Scanner;
public class _1_prac {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter any natural number: ");
        int num=sc.nextInt();
        int sum=0;
        for(int i=0;i<=num;i++){
            sum=sum+i;
        }
        System.out.println(sum);
        sc.close();
    }
}