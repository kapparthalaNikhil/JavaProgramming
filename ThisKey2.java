class Default{
    int roll;
    String name;
    Default(){
        this(10);
        roll = 517;
        name = "nikhil";
    }
    Default(int x){
        System.out.println("x = "+x);
    }
}
public class ThisKey2 {
    public static void main(String[]args){
        Default obj = new Default();
    }
}
