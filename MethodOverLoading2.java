//type conversion 
/*
 widening   = byte -> short -> int -> long -> float -> double
 narrowing  = double -> float -> long -> int -> short -> byte

 */
class OverLoading{
    long sum(int a,int b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
}
public class MethodOverLoading2 {
    public static void main(String[]args){
        OverLoading obj = new OverLoading();
        System.out.println(obj.sum(34,23));
        System.out.println(obj.sum(3,24,23));
    }
}
