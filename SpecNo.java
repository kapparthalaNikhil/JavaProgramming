import java.util.*;
public class SpecNo {
    public static void main(String[]args){
        int n,temp=0;
        String concat,result="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");//327
        n = sc.nextInt();
        for(int i=1;i<10;i++){
            temp=n*i;
            concat = String.valueOf(temp);
            //System.out.println(concat);
            result=concat+concat;
            //System.out.println(result);
            if(result.charAt[i]==i){
                System.out.println(i+"exists");
            }

        }
        
         System.out.println(result);
        

    }
}
