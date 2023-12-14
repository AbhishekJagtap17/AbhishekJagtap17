package MultiThreading.Practice;

class  UserThread extends Thread{
    @Override
    public void run() {
        System.out.println("These is UserThread");
    }
}

public class ThreadOp {
    public static void main(String[] args) {
        System.out.println("Program Strated");
        int x=50+45;
        System.out.println("sum is : "+x);
        Thread t=Thread.currentThread();
           String tName= t.getName();
        System.out.println("Current Running thread : "+tName);

          t.setName("MyName");
        System.out.println("New Running thread name : "+tName);
        try {
            Thread.sleep(5000);
        }catch (Exception e){

        }
        System.out.println(t.getId());

        System.out.println("Program ended..");

        UserThread uT=new UserThread();
        uT.start();
    }
}
