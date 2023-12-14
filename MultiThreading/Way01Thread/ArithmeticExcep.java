package MultiThreading.Way01Thread;

public class ArithmeticExcep extends Thread {

    @Override
    public void run() {

        for (int i=1;i<=10;i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        ArithmeticExcep ref = new ArithmeticExcep();
        ref.setName("Custom");
        ref.start();

        System.out.println(10/0);
    }
}
