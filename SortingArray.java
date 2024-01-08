import java.util.Collections;
import java.util.*;
public class SortingArray {
    public static void main(String[]args){
        Integer a[] = {5,2,3,1,6};
        Arrays.sort(a,Collections.reverseOrder());
        for(int k:a){
            System.out.println(k);
        }
    }
}
