package MultiThreading.Way02Thread;

public class WayToCreateThread02 {
    public static void main(String[] args) {
        //1.create class of type Runnable.
         //-Traditional way
        //-Anonymous way
        //-lambda Expression
        //-method reference

        Runnable runnable=new RunnableImpl();

        //2.Create Thread class object and pass name and runnable type.

        Thread thread=new Thread(runnable,"\t task");

        //3.Call to start method
        thread.start();
       // thread.run();
    }
}
class RunnableImpl implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            System.out.println(i+Thread.currentThread().getName());
        }
    }
}
