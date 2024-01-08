class ArthimaticOperations{
    int sum(int a,int b){
        return a+b;
    }
    int subtraction(int a,int b){
        return a-b;
    }
    int multiples(int a,int b){
        return a*b;
    }
    int division(int a,int b){
        return a/b;
    }
    
}
public class ExClass1 {
    public static void main(String[]args){
        ArthimaticOperations obj = new ArthimaticOperations();
        System.out.println("Addition :"+obj.sum(10,15));
        System.out.println("subtraction :"+obj.subtraction(2,7));
        System.out.println("multiplication :"+obj.multiples(2,6));
        System.out.println("Division :"+obj.division(6,2));
    }
}
