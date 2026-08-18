import java.util.Scanner;
public class _8_1_do_while{
    public static void main(String[] args){
        Scanner sc= new Scanner (System.in);
        int i=0;
        do{
            System.out.println(i);
            i=i+1;
        }while(i<9);
        sc.close();
    }
}