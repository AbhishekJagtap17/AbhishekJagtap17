package ExceptionHandling;

public class Demo14 {
    public static void main(String[] args) {
        //throws keyword
        //Explicitly object of Arithmetic exception will be created
        //It will be given to JRE
        //JRE will give this ti exception handlers
       //System.out.println(10/0);
        throw new ArithmeticException("/ by zero");
    }
}
