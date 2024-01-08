class Business extends Thread{
    int total = 0;
    public void run(){
        synchronized(this){
            try{
                for(int cust=1;cust<=10;cust++){
                    total=total+100;
                }
            }
            catch(ArithmeticException ae){
                System.out.println(ae);
            }
            this.notify();
        }
        
    
    }
}
public class Thread2 {
    public static void main(String[] args) {
        Business te = new Business();
        te.start();
        synchronized(te){
            try{
                te.wait();
            }catch(Exception e){
                System.out.println(
                e);
            }
            System.out.println(te.total);
        }
    }
}
