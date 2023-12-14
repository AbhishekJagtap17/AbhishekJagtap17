package MultiThreading.Way01Thread;


public class Task extends Thread{
    public void run(){
        //run method is the job of thread .task/or  work to be completed.
        for(int index=1;index<1000;index++){
            System.out.println(index+"\t"+Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        Task task =new Task();
        task.setName("print1to1000");
        task.start();
      //  task.run();
    }

    public static class Worker implements Runnable{
        @Override
        public void run() {
            System.out.println("Running");
        }
    }
}
