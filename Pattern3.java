/* print the following pattern below

        * * * * *
        * * * *
        * * *
        * *
        * 
 
 */
import java.util.*;
public class Pattern3{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int rows,colmns;
        System.out.println("rows and colmns must be same !");
        System.out.print("Enter the rows : ");
        rows = sc.nextInt();
        System.out.print("Enter the colmns : ");
        colmns = sc.nextInt();
        for(int i = 0;i<rows;i++){
            for(int j=i;j<colmns;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}