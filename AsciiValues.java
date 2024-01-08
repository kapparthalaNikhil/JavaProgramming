import java.util.Scanner;

public class AsciiValues {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<256;i++){
            System.out.print("Enter a Character : ");
            char c = sc.next().charAt(0);
            int ascii = c;
            System.out.println("ascii of "+c+" is "+ascii);
        }
    }
}
