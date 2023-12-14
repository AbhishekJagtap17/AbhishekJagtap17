package MultiThreading.Java8Features;

public class    RunnableTest {
    public static void main(String[] args) {
        //traditional way:
        Runnable runImpl=new RunImpl();
        runImpl.run();

        //Anonymous way:
        Runnable runnable=new RunImpl(){
            public void run(){
                System.out.println("Anonymous class ");
            }
        };
        runnable.run();

        // lambda expression
        Runnable ref=()-> System.out.println("Lambda is running");
        ref.run();
    }
}
class RunImpl implements Runnable{
    @Override
    public void run() {
        System.out.println("RunImpl is running");
    }
}