package ExceptionHandling;

import java.util.InputMismatchException;

public class Demo01 {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
        }catch (ArithmeticException arithmeticException){
            System.out.println("Invalid Input");
        }catch (InputMismatchException inputMismatchException){
            System.out.println("Invalid type ");
        }
        System.out.println("Rest of the main method");
    }
}
