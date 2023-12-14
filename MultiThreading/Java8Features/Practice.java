package MultiThreading.Java8Features;

public interface Practice {
    public int add(int number1,int number2);

    public static void main(String[] args) {
    //Implementing an interface with anaother class by four way
    Practice practice=new Practice02();
        System.out.println("Byusing traditional way :::"+practice.add(40,53));

        Practice practice1=new Practice(){
            public int add(int number1,int number2){
                return number1+number2;
            }
        };
        System.out.println("By using Annonymous class way:::"+practice1.add(50,50));

        Practice practice2=(number1,number2)->(number1+number2);
        System.out.println("By using lambda expression way::"+practice2.add(20,20));

        Practice practice3=Integer::sum;
        System.out.println("By using method reference way:::"+practice3.add(50,60));
    }
}
class Practice02 implements Practice{
    @Override
    public int add(int number1, int number2) {
        System.out.println("Override Practice");
        return number1+number2;
    }
}
