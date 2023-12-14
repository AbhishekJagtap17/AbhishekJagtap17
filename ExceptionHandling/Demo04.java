package ExceptionHandling;

public class Demo04 {
    public static void main(String[] args) {
        try{
            String str=null;
            System.out.println(str.length());    //It gives NullPointerException and we cannot create catch for NullPointerException.
        }catch(ArithmeticException arithmeticException){
            System.out.println("No operation are allowed on null");
        }
        System.out.println("Rest at the main method");
    }
}
