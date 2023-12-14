package MultiThreading;


import MultiThreading.Way01Thread.Task;

public class Demo01
{
    public static void main(String[] args) {

        // Traditional way :
        Runnable runnable=new Task.Worker();
        runnable.run();


        //Anonymous class :
        Runnable runnable1=new Runnable(){
            public void run(){
                System.out.println("Anonymous class Running method ");
            }
        };
        runnable1.run();


        //Lambda Expression :
        Runnable runnable2=()-> System.out.println("Lambda Expression run method");
        runnable2.run();
    }
}
