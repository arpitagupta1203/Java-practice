// Write a function that takes in age as input and returns if that person is eligible
// to vote or not. A person of age > 18 is eligible to vote.

import java.util.Scanner;

public class _9_9_function_vote_eligiblity {

    public static void voteEligiblity(int age){
        if(age<=0){
            System.out.println("Invalid!");
        }
        else if(age>0 && age<18){
            System.out.println("can not vote! ");
        }
        else{
            System.out.println("Able to vote! ");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age: ");
        int age=sc.nextInt();
        voteEligiblity(age);
        sc.close();
    }
    
}
