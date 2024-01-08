import java.util.Arrays;
public class SortArraySwap {
    public static void main(String[]args){
        int a[] = {5,3,6,4,6,7,9,1,8,2};
        System.out.println("Before swaping : ");
        for(int i:a){
            System.out.print(i + " ");
        }
        Arrays.sort(a);
        System.out.println("\nAfter swaping : ");
        for(int k:a){
        System.out.print(k + " ");
        }
    }
}
