class R implements Runnable{
    public void run(){
        System.out.println("welcome to spec");
    }
}
public class Runnablee {
    public static void main(String[] args) {
        Runnable r = new R();
        Thread t = new Thread(r,"spec");
        System.out.println(t.getName());
        t.start();
    }
}
