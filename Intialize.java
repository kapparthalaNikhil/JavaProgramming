class Spec{
    int p;
    void sum(){
        int p = 5;
        Spec s = new Spec();
        System.out.println(s);
        System.out.println(s.p);
        System.out.println(p);
    }

}
public class Intialize {
    public static void main(String[]args){
        Spec v = new Spec();
        v.sum();
        System.out.println(v);
        System.out.println(v.p);
        v.p=10;
        System.out.println(v.p);
        Spec k=v;
        System.out.println(k);
        System.out.println(k.p);

    }
}
