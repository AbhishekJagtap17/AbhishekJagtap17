package MultiThreading.Way01Thread;

import java.time.LocalDateTime;

public class SumWithThread extends Thread{
    public static long sum=0;

    @Override
    public void run() {
        for (int i = Integer.MAX_VALUE/2+1; i < Integer.MAX_VALUE-1 ; i++) {
            sum+=i;
        }
    }

    public static void main(String[] args) throws InterruptedException {

        //
        SumWithThread sumWithThread=new SumWithThread();
        sumWithThread.start();

        // Main thread job : to execute the main thread.
        LocalDateTime startTime=LocalDateTime.now();
        for (int i = 1; i <Integer.MAX_VALUE/2 ; i++) {
            sum+=i;
        }
        LocalDateTime endTime=LocalDateTime.now();
        sumWithThread.join();                           //Main thread will wait to complete the execution of another thread.

        System.out.println("Sum of integer value "+sum);
        System.out.println("Time taken for completing process "+(endTime.getSecond()-startTime.getSecond()));
    }
}
