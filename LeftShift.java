//logical left shift operator will multiply the number by 2 every time
public class LeftShift {
    public static void main(String[]args){
        int a = 10; //1010
        System.out.println(a<<2); //1010 << 00 -> 101000 left shift operatiion adds zeros at right and not deletes any bits
        System.out.println(a>>2); //1010 >> 00 -> 0010 right shift operation deletes the right bits after assigning zeros
        int x = 100;
        System.out.println(x>>3);
        System.out.println(x>>>3);
        System.out.println(x<<3);
       // System.out.println(x<<<3);//"Syntax error on token \"<\", delete this token".

    }
}
