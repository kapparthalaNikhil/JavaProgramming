import java.util.*;
public class Task {
    public static void main(String[] args) {
        //1.printing sum of n natural numbers
        Scanner sc = new Scanner(System.in);
        int n,sum=0;
        System.out.println("enter the n value : ");
        n = sc.nextInt();
        for(int i=1;i<=n;i++){
            sum += i;
        }
        System.out.println("sum : "+sum);
    }
}
