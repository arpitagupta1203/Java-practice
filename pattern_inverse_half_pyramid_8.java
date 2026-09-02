import java.util.Scanner;
public class pattern_inverse_half_pyramid_8{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        for(int i=4;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        sc.close();
    }
}