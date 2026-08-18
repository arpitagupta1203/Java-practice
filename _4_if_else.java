import java.util.Scanner;
public class _4_if_else{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter age: ");
        int age= sc.nextInt();
        if(age>18){
            System.out.println("Can vote!");
        }
        else{
            System.out.println("Can not vote!");
            
        }
        sc.close();
    }
}
