class OverLoading{
    int sum(int a,int b){
        return(a+b);
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
}
public class MethodOverLoading{
    public static void main(String[]args){
        OverLoading obj = new OverLoading();
        int z = obj.sum(5,4);
        int y = obj.sum(19,34,53);
        System.out.println("sum of 2: "+z);
        System.out.println("sum of 3 :"+y);
    }
}