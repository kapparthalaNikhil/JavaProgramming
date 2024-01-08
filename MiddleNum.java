import java.util.Scanner;

public class MiddleNum {
    public static void main(String[]args){
        int n,rem,count = 0,b=0; //n=245
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        n = sc.nextInt();
        while(n>0){
            rem = n % 10; // 1-rem = 45 ,2-rem = 5
            b = rem/10; //b = 45 ,b = 5
            count++;
            if(count == 2){
                if(b % 2 == 0){
                    System.out.println(b + " number is Even");
                    break;
                }else{
                    System.out.println(b + " number is Odd");
                    break;
                }
            }
        }
    }
}
