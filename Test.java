import java.util.*;
class Programs{
    void arr(){
        int arr1[]={2,34,52,2,523,5,2};
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+",");
        }
        System.out.println("\n3rd element in an array : " +arr1[2]);
        System.out.println("2nd element in an aray is : "+arr1[1]);
    }
    void oddNums(){
    System.out.println("\nOdd numbers from 1 to 10 : ");
        for(int i=1;i<=100;i++){
            if(i%2!=0){
                System.out.print(i+" ");
            }
            }
    }
    void randomNum(){
        int n=10;
        Random ran = new Random();
        int num = ran.nextInt(10);
        System.out.println("\n\nRandom number between 0 and "+n+": " + num);
    }
    void specNum(){
        int n = 3;
        int y = n+1;
        double p = Math.sqrt(y);
        double q = Math.floor(p);
        if(p==q){
            System.out.println(n+" spec number");
        }else{
            System.out.println(n+" not spec number");
        }
    }
}
public class Test {
    public static void main(String[]args){
        Programs obj = new Programs();
        obj.arr();
        obj.oddNums();
        obj.randomNum();
        obj.specNum();
    }
}
