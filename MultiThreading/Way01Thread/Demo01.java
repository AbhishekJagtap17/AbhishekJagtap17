package MultiThreading.Way01Thread;

public class Demo01 {
    public static void main(String[] args) {
        //Traditional way:
        Runnable worker=new Task.Worker();
        worker.run();

        //Anonymous class way:
        Runnable ref=new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous class running");
            }
        };
        ref.run();

        //by using lambda expression
        Runnable lambda=()-> System.out.println("Lambda is running");
        lambda.run();
    }
}
