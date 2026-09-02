import java.util.Scanner;
public class pattern_solid_rect_3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        for(int i=1;i<=5;i++){
            for(int j=1;j<=9;j++){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
        sc.close();
    }
}