class MyThread extends Thread{
    public void run(){
        System.out.println(Thread.getName());
    }
    public class MyThread3{
        public static void main(String[]args){
            MyThread t = new MyThread();
            t.start();
            t.run();
        }
    }
}