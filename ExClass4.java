class Friends{
    int rollNo;
    String name;
    void mySelf(int a,String b){
        rollNo = a;
        name = b;
        System.out.println("my name     : "+name +"\n"+"roll no     : "+rollNo);
    }
    void friend(int x,String y){
        rollNo = x;
        name = y;
        System.out.println("friend name : "+name+"\n"+"roll no     : "+rollNo);
    }
}
public class ExClass4 {
    public static void main(String[]args){
        Friends obj = new Friends();
        obj.mySelf(511, "reeshap");
        obj.friend(509,"ajay");
    }
}