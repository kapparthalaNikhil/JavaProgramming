import java.util.*;
public class ReverseNum {
    public static void main(String[]args){
        int num,reverse =0,rem;
        int y = 10,count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        num = sc.nextInt();
        while(num>1){
            rem = num % 10;
            reverse = rem +reverse * 10;
            num = Math.floorDiv(num , y);
        }
        System.out.println(reverse + " reverse");
        if(reverse>1){
            for(int i = 1;i<=reverse;i++){
                if(reverse % i==0){      //number divisible by 1 and itself is prime number
                    count++;        //so count value is 2 become prime or else not prime number
                }
            }
               if (count==2){
            System.out.println(reverse +" Is a prime number");
        }else{
            System.out.println("not a prime number");
        }
        }else{
            System.out.println("Not a prime number");
        }
        

    }
}
