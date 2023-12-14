package MultiThreading.Practice;

public class AnotherThread  extends  Thread{
    @Override
    public void run() {
        for (int i = 10; i >=1; i--) {
            System.out.println("Another thread : "+i);
            try{
                Thread.sleep(2000);
            }catch (Exception e){

            }
        }
    }

    public static void main(String[] args) {
   MyThread2 t=new MyThread2();
    t.start();
    }
}
