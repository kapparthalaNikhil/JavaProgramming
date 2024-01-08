import java.util.*;
public class Pattern5 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int rows,colmn,i,j,k;
        System.out.print("Enter the rows : ");
        rows = sc.nextInt();
        System.out.print("Enter the colmns : ");
        colmn = sc.nextInt();
        for(i=1;i<rows;i++){
            for(j=1;j<=i;j++){
                System.out.print("  ");
            }
            for(k=1;k<=colmn-i;k++){
                System.out.print("* ");
            }
            //colmn--;
            System.out.println();
        }


    }
}
