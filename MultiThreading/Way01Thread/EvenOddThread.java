package MultiThreading.Way01Thread;

public class EvenOddThread extends Thread  {
    public static void main(String[] args) {
      EvenThread evenThread=new EvenThread();
      evenThread.setName("Even");
      evenThread.start();

      OddThread oddThread=new OddThread();
      evenThread.setName("Odd");
      oddThread.start();

    }
}
