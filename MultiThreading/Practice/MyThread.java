package MultiThreading.Practice;

//Creating our thread using runnable interface
public class MyThread  implements  Runnable{
    @Override
    public void run() {
        //task for thread...
        for(int i=1;i<=10;i++){
            System.out.println(i);
            try{
                Thread.sleep(1000);
            }catch (Exception e){

            }
        }
    }

    public static void main(String[] args) {
        //create object of mythread class
        MyThread myThread=new MyThread();
        Thread t1=new Thread(myThread);
        t1.start();

        //Creating object of MyThread2 Class.
        MyThread2 t2=new MyThread2();
        t2.start();
    }
}
class MyThread2 extends  Thread {
    @Override
    public void run() {
        for (int i = 10; i >= 1; i--) {
            System.out.println("Another thread : " + i);
            try {
                Thread.sleep(2000);
            } catch (Exception e) {

            }
        }
    }
}