import java.util.*;
public class ReverseString {
    public static void main(String[]args){
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name :");
        str = sc.next();
        String rev = " ";
        int n = str.length()-1;
        for (int i=n;i>=0;i--){
          System.out.print(str.charAt(i));
        }
    }
}
