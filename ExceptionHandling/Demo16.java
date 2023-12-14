package ExceptionHandling;

//throws keyword :
public class Demo16 {
    public static void main(String[] args) {
        try{
            System.out.println(divide(10,0));
        }catch (ArithmeticException arithmeticException){
            System.out.println("Invalid Denominator");
        }
        System.out.println("Rest to main method:");
    }
    public static int divide(int num1,int num2)throws ArithmeticException{
        return num1/num2;
    }
}
