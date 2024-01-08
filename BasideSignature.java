//throws keyword uses beside the methods 
public class BasideSignature{
    public static void age(int n) throws ArithmeticException{
        if(n<19){
            throw new ArithmeticException("not eligible");
        }else{
            System.out.println("eligible");
        }
    }
    public static void main(String... args){
        age(50);
    }
}
