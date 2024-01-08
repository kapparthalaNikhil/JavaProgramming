
    import java.util.*;
public class Pattern9 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int rows,count=0,i,j,k;
        System.out.print("Enter the rows : ");
        rows = sc.nextInt();
        // System.out.print("Enter the count : ");
        // count = sc.nextInt();

        for(i=0;i<rows;i++){
            for(j=0;j<=i;j++){
                System.out.print("  ");
            }
            for(k=rows+rows+1-(i+i);k>0;k--){
                System.out.print("* ");
            }
            System.out.println();
        }
      
        for(i=1;i<rows*2;i++){
            for(j=rows;j>1;j--){
                System.out.print("  ");
            }
            for(k=1;k<=i;k++){
                System.out.print("* ");
            }
        
            System.out.println();
        }

          
        


    }
}


