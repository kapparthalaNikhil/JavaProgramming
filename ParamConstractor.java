public class ParamConstractor {
    int a;
    String b;
    ParamConstractor(int a,String b){
        this.a=a;
        this.b=b;
        System.out.println(this.a);
        System.out.println(this.b);
    }
    public static void main(String[]args){
        ParamConstractor obj=new ParamConstractor(5000,"Hari");
    }
}
