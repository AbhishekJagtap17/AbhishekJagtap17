package MultiThreading.Way02Thread;

public class EvenOddDemo {
    public static void main(String[] args)  {

        Runnable even=()->{
            for (int i = 1; i <= 100; i++) {
                if(i%2==0){
                    System.out.println(i+"\t"+Thread.currentThread().getName());
                }
            }
        };

        Thread thread01=new Thread(even,": Even");
         thread01.start();


        Runnable odd=()->{
            for (int i = 1; i < 100; i++) {
                if(i%2!=0){
                    System.out.println(i+Thread.currentThread().getName());
                }
            }
        };

    Thread thread02=new Thread(odd,": Odd");
        thread02.start();

        //thread02.join();
    }
}
