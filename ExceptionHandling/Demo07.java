package ExceptionHandling;

import java.util.InputMismatchException;

public class Demo07 {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
        }catch (NullPointerException nullPointerException){
            System.out.println("No operations are allowed on null");
            try {
                System.out.println(10/0);
            } catch (ArithmeticException arithmeticException) {
                System.out.println("Invalid input divide by 0");
            }
        }catch (InputMismatchException inputMismatchException){
            System.out.println("Input mismatched");

        }finally {
            System.out.println("Closing the database connection");
        }
        System.out.println("At the rest main method");
    }
}
