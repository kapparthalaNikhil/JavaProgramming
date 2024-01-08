
    import java.util.*;
public class Pattern6 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int rows,colmn,i,j,k;
        System.out.print("Enter the rows : ");
        rows = sc.nextInt();
        System.out.print("Enter the colmns : ");
        colmn = sc.nextInt();

        for(i=1;i<rows;i++){
            for(j=colmn;j>1;j--){
                System.out.print("  ");
            }
            colmn--;
            for(k=1;k<=i;k++){
                System.out.print("* ");
            }
        
            System.out.println();
        }


    }
}


