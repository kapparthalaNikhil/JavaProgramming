
    import java.util.*;
public class Pattern7 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int rows,colmn,i,j,k;
        System.out.print("Enter the rows : ");
        rows = sc.nextInt();
        System.out.print("Enter the colmns : ");
        colmn = sc.nextInt();

        for(i=0;i<rows;i++){
            for(j=0;j<rows;j++){
                if(i==0 || i==rows-1){
                    System.out.print("* ");
                }else if(j==0 || j==rows-1){
                        System.out.print("|"+"  ");
                }else{
                        System.out.print("");
                }
            }
        }


    }
}


