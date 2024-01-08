import java.util.*;
public class Pattern1 {
    public static void main(String[]args){
        int rows,colmn,num = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row no :");
        rows = sc.nextInt();
        System.out.print("Enter the colmn no :");
        colmn = sc.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=0;j<colmn;j++){
                System.out.print(num+"   ");
                num++;
            }
            System.out.println();
        }
    }
}
