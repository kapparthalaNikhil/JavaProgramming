public class Thread7 implements Runnable{
    public void run(){
        System.out.println("welcome to spec");
    }    
    public static void main(String[]args){
        Runnable r = new Thread7();
        Thread t = new Thread(r,"harith");
        t.start();
        String Str = t.getName();
        System.out.println(t.getName());
        // t.run();
    }
}
