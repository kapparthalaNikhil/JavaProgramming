class Myt extends Thread{
    public void run(){
        if(Thread.currentThread().isDaemon()){
            System.out.println("daemon thread");
        }else{
            System.out.println("child thread");
        }
    }
}
public class Thread13 {
    public static void main(String[] args) {
        System.out.println("main thread");
        Myt t1 = new Myt();
        Myt t2 = new Myt();
        Myt t3 = new Myt();
        Thread t = new Thread();
        t.setName("nick");
        t1.setDaemon(true);
        t2.setDaemon(true);
        t1.start();
        t2.start();
        t3.start();
    }
}
