package ExceptionHandling;

public class Demo02 {
    public static void main(String[] args) {
        try{
            String str=null;
            System.out.println(str.length());
        }catch(NullPointerException nullPointerException){
            System.out.println("No operation are allowed in null");
        }catch(ArithmeticException arithmeticException){
            System.out.println("");
        }
        System.out.println("Rest of the main method");
    }
}
