package MultiThreading;


public class WayToCreateThread01 {
    public static void main(String[] args) {
        Runnable ref=()->{
            for(int index=1;index<100;index++){
                System.out.println(index+"\t"+Thread.currentThread().getName());
            }
        };
        Thread thread=new Thread(ref,"User defined thread");
        thread.start();
    }
}
