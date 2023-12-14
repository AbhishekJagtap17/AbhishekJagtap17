package MultiThreading.Way01Thread;

public class Demo02 {
    public static void main(String[] args) {
        Runnable job=()->{
            for (int index = 1; index <100 ; index++) {
                System.out.println(index+" "+Thread.currentThread().getName());
            }
        };

        Thread thread=new Thread(job,"User Defined thread");
        thread.start();
    }
}
