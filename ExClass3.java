class Methods{
    int rollNo;
    String name;
    void display(int m,String n){
        rollNo = m;
        name = n;
    }
    void showData(){
        System.out.println("roll no : "+rollNo+"\n"+"student name : "+name);
    }
}
public class ExClass3 {
    public static void main(String[]args){
        Methods obj = new Methods();
        obj.display(511,"Ajay");
        obj.showData();
    }
}
