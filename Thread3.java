/* the single process is divided into multiple threads is called the multiThreading
Advantages of multi threading
-> affeciency will be improve 
-> process contact switching is done
-> it improves the performance
*/
public class Thread3 extends Thread{
    public void run(){
        System.out.println("welcome to spec");
        //System.out.println(t.getName());
    }
    public static void main(String[] args) {
        Thread3 t = new Thread3();
        t.setName("Nickle");
        t.start();
        System.out.println(t.getName());
    }
}
