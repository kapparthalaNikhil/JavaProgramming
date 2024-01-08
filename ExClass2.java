//initializing variable by using classes and objects
class Initiaze{
    int a;
    int b;
    int rollNo;
    String name;
    int display(int y){
        int z=y;
        return z;
    }
}
public class ExClass2 {
    public static void main(String[]args){
        Initiaze obj = new Initiaze();
        obj.a=10;
        obj.b=39;
        obj.rollNo = 511;
        obj.name = "Ajay";
        System.out.println(obj.a + " " + obj.b);
        System.out.println(obj.rollNo+" " + obj.name);
        System.out.println(obj.display(343));
    }
}
