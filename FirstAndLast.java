//printing first and last element in a string
public class FirstAndLast {
    public static void main(String[]args){
        String name = "Harith Reddy";
        int length;
        length=name.length();
        System.out.println("First element in a string is " +name.charAt(0));
        System.out.println("Last element in a string is " + name.charAt(length-1));
        
    }
}
