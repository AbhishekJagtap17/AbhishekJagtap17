package MultiThreading.ProducerConsumerProblem;

public class Consumer extends Thread{
    Company c;
    Consumer(Company c){
        this.c=c;
    }
    public void run(){
        while(true){try{
            this.c.consume_item();}catch (Exception e){}
            try{
                Thread.sleep(1000);
            }catch (Exception e){

            }
        }
    }
}
