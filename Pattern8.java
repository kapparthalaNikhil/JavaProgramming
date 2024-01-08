
    import java.util.*;
public class Pattern8 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int rows,count=0,i,j,k;
        System.out.print("Enter the rows : ");
        rows = sc.nextInt();
        // System.out.print("Enter the count : ");
        // count = sc.nextInt();

        for(i=0;i<rows;i++){
            for(j=rows-i-1;j>0;j--){
                System.out.print("  ");
            }
            for(k=0;k<=count;k++){
                System.out.print(" *");
            }
            count+=2;
            System.out.println();
        }


    }
}


