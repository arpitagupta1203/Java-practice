import java.util.Scanner;
public class _2_datatype{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in); // to take input
        
        System.out.println("Enter a number: ");
        int a= sc.nextInt();
        System.out.println("Number is: "+a);
        
        System.out.println("Enter name: ");
        String name= sc.next();
        System.out.println("Name is: "+name);

        System.out.println("Enter name: ");
        sc.nextLine(); // it is to consume the leftover
        String Name= sc.nextLine();
        System.out.println("the name is: "+Name);

        System.out.println("taj is in agra: ");
        Boolean isit = sc.nextBoolean();
        System.out.println("your asnwer: "+isit);

        System.out.println("Enter your marks: ");
        Float marks = sc.nextFloat();
        System.out.println("your marks are: "+marks);

        sc.close();

    }
}