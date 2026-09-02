import java.util.Scanner;
public class pattern_hollow_rect_4{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        for(int i=1;i<=8;i++){
            for(int j=1;j<=5;j++){
                if(i==1||j==1||i==8||j==5){
                    System.out.print("*");
                }
                else{
                System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
        sc.close();
    }
}