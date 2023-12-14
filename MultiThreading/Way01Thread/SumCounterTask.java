package MultiThreading.Way01Thread;

import java.time.LocalDateTime;

public class SumCounterTask extends Thread{
    public  static long sum=0;

    @Override
    public void run() {
        for (int i = 1; i <(Integer.MAX_VALUE/2 ); i++) {
            sum+=i;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        SumCounterTask thread =new SumCounterTask();
        thread.start();

        LocalDateTime startTime=LocalDateTime.now();
        for (int i =( Integer.MAX_VALUE/2+1); i <Integer.MAX_VALUE-1 ; i++) {
            sum+=i;
        }
        LocalDateTime endTime=LocalDateTime.now();
        thread.join();

        System.out.println("Sum is "+sum);
        System.out.println("Time taken to complete the process "+ (endTime.getSecond()-startTime.getSecond())+"sec");

    }
}
