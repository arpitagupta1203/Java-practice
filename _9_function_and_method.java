// funciton and method: 
// so they are basically same -->they take the input and give the output as operation is performed
// but----------
// methods are called by class object
// whereas:
// functions are called directly



import java.util.Scanner;


public class _9_function_and_method {
    // function making
    public static void printMyName(String name){
        System.out.print("Your name is:");
        System.out.print(name);
        return;
    }
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the name: ");
        String name=sc.next();

        printMyName(name);
        sc.close();
    }
}
