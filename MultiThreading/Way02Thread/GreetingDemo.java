package MultiThreading.Way02Thread;

public class GreetingDemo {
    public static void main(String[] args) {

        Runnable ref01=()-> System.out.println("Good Moring "+Thread.currentThread().getName());
        Thread thread01=new Thread(ref01,"GM");
        thread01.start();

        Runnable ref02=()->System.out.println("Good Afternoon "+Thread.currentThread().getName());
        Thread thread02=new Thread(ref02,"GAF");
        thread02.start();

        Runnable ref03=()-> System.out.println("Good Night "+Thread.currentThread().getName());
        Thread thread03=new Thread(ref03,"GN");
        thread03.start();


    }
}
