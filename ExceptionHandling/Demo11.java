package ExceptionHandling;

public class Demo11 {
    public static void main(String[] args) {
        try {
            try {
                System.out.println(10/0);
            }catch (ArithmeticException arithmeticException){
                System.out.println("Invalid denominator");
            }
            System.out.println("try");
        }catch (ArithmeticException arithmeticException){
            System.out.println("catch");                          // statment cannot execute because there are no exception
        }finally {
            System.out.println("finally");
        }
        System.out.println("Rest ot the main method");
    }
}
