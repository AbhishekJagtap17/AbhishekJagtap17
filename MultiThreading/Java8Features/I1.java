package MultiThreading.Java8Features;

@FunctionalInterface
public interface I1 {
    public int add(int number1,int number2);

    public static void main(String[] args) {
     //traditional way:
        I1 i1=new I2();
        System.out.println("By using traditional way"+i1.add(10,20));

        //anonymous class way:
        I1 i2=new I1(){
            @Override
            public int add(int number1, int number2) {
                return number1+number2;
            }
        };
        System.out.println("By using anonymous class way : "+i2.add(20,20));

        // Lambda Expression way:
        I1 lambda=(number1,number2)->(number1+number2);
        System.out.println("By using lambda expression way :"+lambda.add(30,30));

        // method Reference:
        I1 ref=Integer::sum;
        System.out.println("Method reference ways: "+ref.add(40,40));
    }
}
class I2 implements I1{
    @Override
    public int add(int number1, int number2) {
        System.out.println("Override I2");
        return ++number1;
    }
}