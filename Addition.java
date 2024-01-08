class Add{
    int x,y,z;
    public void Add(int a,int b){
        x = a;
        y = b;
    }
    public void sum(){
        z = x+y;
        System.out.println(z);
    }
}
public class Addition {
    public static void main(String[] args) {
        Add d = new Add();
        d.Add(34,66);
        d.sum();
    }
}
