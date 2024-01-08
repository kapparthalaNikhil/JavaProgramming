//by usig the concept of daemon thread print the number from 1 to 5 by using sleep();
class Thrd extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().isDaemon());
       
    }
}
public class Thread12 {
    public static void main(String[] args) {
        Thrd t = new Thrd();
        t.run();
        System.out.println(t.sleep(1000));
    }
}
