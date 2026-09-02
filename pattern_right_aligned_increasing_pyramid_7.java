import java.util.Scanner;
public class pattern_right_aligned_increasing_pyramid_7{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}