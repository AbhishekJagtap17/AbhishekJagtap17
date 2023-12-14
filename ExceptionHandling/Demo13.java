package ExceptionHandling;

public class Demo13 {
    public static void main(String[] args) {
       try{
           System.out.println(10/0);
       }catch (ArithmeticException arithmeticException){
           System.out.println("Denominator is zero ");
       }
       //Order of catch block should be child to parent.
       catch (Exception exception){
           System.out.println("Parent class Exception");
       }
    }
}