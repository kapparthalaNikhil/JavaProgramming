public class Methods {
    public static void pointer(){
        String s = null;
        if(s==null){
            throw new NullPointerException("null");
        }else{
            System.out.println("sgsg");
        }
    }
    public static void main(String[]args){
        pointer();
    }
}
