import java.util.Scanner;
public class pattern_number_right_half_payramid_10 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        for(int i=1;i<=5;i++){
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            // number
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println(" ");
        }
        sc.close();
    }
}
