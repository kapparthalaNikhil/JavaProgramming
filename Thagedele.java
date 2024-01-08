class Pushpa{
    void dialogue(){
        System.out.println("Thagedhe Le !");
    }
}
class Sarith extends Pushpa{
    void dialogue(){
        System.out.println("kcpd");
    }
}
class Akhilesh extends Pushpa{
    void dialogue(){
        System.out.println("kmpd");
    }
}
public class Thagedele {
    public static void main(String[]args){
        Sarith obj1 = new Sarith();
        Akhilesh obj2 = new Akhilesh();
        obj1.dialogue();
        obj2.dialogue();
    }
}
