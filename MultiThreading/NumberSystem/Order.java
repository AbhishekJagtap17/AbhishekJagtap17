package MultiThreading.NumberSystem;

public class Order extends Thread  {
    boolean f=false;
   synchronized public void run() {
       if(f){
           try{
           wait();}catch (Exception e){};
       }
        for (int i = 1; i <=15 ; i++) {
            System.out.println(i);
            try{
                Thread.sleep(1000);}catch (Exception e){}
        }
        f=true;
        notify();
    }
}
