public class Thread4 implements Runnable{
    public void run(){
        System.out.println("welcome to spec");
    }
    public static void main(String[] args) {
        Thread t = new Thread(new Thread4());
        t.start();
        System.out.println(t.getName());
    }
}
