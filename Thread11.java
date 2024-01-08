/*
Daemon Thread in multiThreading
 there are two types of threads 
 -> user diffined threads : user difined thread is also known as non daemon thread.
 non daemon thread is running in fronted of the application

 -> daemon thread : daemon threads will run in background of on application.
 daemon thread will services to non daemon thread
 Ex : teacher and student
 Syntax to create daemon thread : 
 public static void setDaemon(boolean b);
 public static isDaemon();

 Rules for creating a Daemon Thread :
 1. A daemon thread should created before a start() else JVM will through illegal thread exception
 2. Daemon will thread will inherit all the properties of parent thread.
 3.
*/
class MyThread extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().isDaemon());
        System.out.println("child thread");
    }
}
public class Thread11 {
    public static void main(String[] args) {
        System.out.println("main thread");
        MyThread t = new MyThread();
        t.setDaemon(true);
        t.start();
    }
}
