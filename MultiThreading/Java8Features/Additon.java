package MultiThreading.Java8Features;

public interface Additon {
    int multiply(int number1,int number2);

    public static void main(String[] args) {
        //by using lambda :
        Additon ref=(number1,number2)->(number1*number2);
        System.out.println("By using lambda : "+ref.multiply(10,10));

        Additon additon=Integer::sum;
        System.out.println(additon.multiply(10,20));
    }
}
