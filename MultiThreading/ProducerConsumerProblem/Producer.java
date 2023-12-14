package MultiThreading.ProducerConsumerProblem;

import MultiThreading.ProducerConsumerProblem.Company;

public class Producer extends Thread{
    Company c;
    Producer(Company c){
        this.c=c;
    }

    @Override
    public void run() {
        int i=1;
        while(true){
            try{
            this.c.produce_item(i);}catch (Exception e){}
            try{
                Thread.sleep(1000);
            }catch (Exception exp){

            }
            i++;
        }
    }
}
