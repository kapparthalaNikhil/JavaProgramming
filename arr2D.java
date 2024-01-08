import java.util.*;
public class arr2D {
    public static void main(String[]args){
        int x = 3;
        int y = 3;
        int a[][]= new int[x][y];
        int i,j;
        Scanner sc = new Scanner(System.in);
        for(i=0;i<x;i++){
            for(j=0;j<y;j++){
                System.out.print("enter element at "+i+","+j +" : ");
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("The given array : ");
        for(i=0;i<x;i++){
            for(j=0;j<y;j++){
                System.out.print(a[i][j]+" ");
            }
        }
        for(i=0;i<x;i++){
            for(j=0;j<y;j++){
                if(a[i][j]==6){
                    System.out.println("\nvalue 6 at position : a("+i+","+j+")");
                }
            }
        }

    }
}
