class Threadd extends Thread{
    public void run(){
        // try{
            for(int i=1;i<=5;i++){
                System.out.println(i);
                Thread.sleep(1000);
        //     }
        // }catch(Exception e){
        //     System.out.println(e.toString());
        // }
    }
}
public class MyThread4 {
    public static void main(String[] args) {
        Threadd t = new Threadd();
        t.start();
    }
}
