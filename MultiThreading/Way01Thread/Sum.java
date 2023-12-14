package MultiThreading.Way01Thread;

import java.time.LocalDateTime;

public class Sum {
    public static long sum=0;

    public static void main(String[] args) {
    //man thread job : To execute the main method.
        LocalDateTime startTime= LocalDateTime.now();
        for (int i = 1; i <=Integer.MAX_VALUE-1; i++) {
            sum+=i;
        }
        LocalDateTime endTime=LocalDateTime.now();
        System.out.println("Sum : "+sum);
        System.out.println("Time taken for completion is "+(endTime.getSecond()-startTime.getSecond()));
    }
}
