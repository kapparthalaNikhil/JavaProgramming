public class Thread1 implements Runnable {
    public static void main(String[] args) {
        Thread t = new Thread("Nikhil");
        Thread k = new Thread("Nick");
        System.out.println(t.getName());
        System.out.println(k.getName());
    }
    public void run(){
        
    }
    
}
