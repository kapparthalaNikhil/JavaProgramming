//check whether the age is eligible for voting or not using while loop
import java.util.*;
public class VoteUsingWhile {
    public static void main(String[]args){
        int age;
        System.out.println("enter the age :");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        while(age>=18){
            System.out.println("eligible for voting");
            break;
        }
        while(age<18){
        System.out.println("Not Eligible for voting");
        }
    }
}
