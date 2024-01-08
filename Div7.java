import java.util.*;
public class Div7 {
    public static void main(String[]args){
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        num = sc.nextInt();
        if(num%7==0){
            System.out.println(num+" Divisible by 7");
        }else{
            System.out.println(num+" Not Divisible by 7");
        }
    }
}
