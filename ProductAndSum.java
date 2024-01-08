import java.util.*;
public class ProductAndSum {
    public static void main(String[]args){
        int n, product, rem, sum=0,prod=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        n = sc.nextInt();
        while(n>0){
            rem = n % 10;
            sum = sum + rem;
            prod = prod * rem;
            n = Math.floorDiv(n,10);
        }
        System.out.println("sum = "+sum + " " + " Product = " + prod);
    }
}
