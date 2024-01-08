// In java main method can also be overloaded
/*
 NOTE : A method can not be overloaded only by changing the return type of the method.
 */
public class MainMethodOverLoading {
    public static void main(String []args){
        System.out.println("main method overloading with string[]");
    }
    public static void main(String args){
        System.out.println("main method overloading with string");
    }
    public static void main(){
        System.out.println("main method overloading with no arguments");
    }
   

}
