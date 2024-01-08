public class Thread5 extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getPriority());
    }
    public static void main(String... args){
        Thread5 t = new Thread5();
        t.start();
        t.setPriority(Thread.MIN_PRIORITY);
        t.setPriority(Thread.MAX_PRIORITY);
    }
}