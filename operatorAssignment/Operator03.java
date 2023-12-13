package operatorAssignment;
public class Operator03 {
    public static void main(String[] args) {
       int  number=2345;
       int number1=number+8;
       int number2= number1/3;
        System.out.println(number2);

        int m=number%10;
        int res=number2*m;
        System.out.println(res);

        number+=8;
        System.out.println("Addition is :"+number);
        number-=3;
        System.out.println("Subtraction is :"+number);
        number/=5;
        System.out.println("Division  is :"+number);
        number*=5;
        System.out.println("Multiplication is :"+number);

    }
}
