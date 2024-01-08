class Exceptions{
    void arrayException(){
        int a[] = new int[5];
        a[0]=1;
        a[1]=2;
        a[2]=3;
        a[3]=4;
        a[4]=5;
        // a[6]=6;
        try{
            a[5]=6;
        }catch(ArrayIndexOutOfBoundsException ai){
            System.out.println(ai.toString());
        }finally{
            System.out.println("program executed");
        }
    }
    void zeroBy(){
        int a = 10,b = 0,res;
        res=a/b;
        // System.out.println(res);
        throw new ArithmeticException("/ by zero");
        

    }
    void voteEligibility(){
        int age = 12;
        if(age<18){
            throw new ArithmeticException("not Eligible for vote");
        }else{
            System.out.println("Eligible for voting");
        }
    }
    void withDraw(){
        int wdamount=45000;
        int bBalance = 40000;
        if(wdamount>bBalance){
            throw new ArithmeticException("Insufficient Balance");
        }else{
            System.out.println("Amount is withdrawing");
        }
    }
    
}
public class TryCatch {
    public static void main(String[] args) {
        ArithmeticException ae = new ArithmeticException();
        System.out.println(ae);
       Exceptions obj = new Exceptions();
       
    }
}
