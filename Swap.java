//swap two number using bitwise operators
import java.util.*;
public class Swap{
    public static void main(String[]args){
        int num1, num2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number:");
        num1 = scanner.nextInt();
        System.out.print("Enter second number:");
        num2 = scanner.nextInt();
        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;
        scanner.close();
        System.out.println("The First number after swapping, num1 ="+num1);
        System.out.println("The Second number after swapping, num2 ="+num2);
    }

    
    
}

