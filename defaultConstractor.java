
public class defaultConstractor {
    int id;
    String name;
    defaultConstractor(){
        id=574;
        name="spec";
        System.out.println(id+" "+name);
    }
    public static void main(String[]args){
        defaultConstractor obj = new defaultConstractor();
    }
}
