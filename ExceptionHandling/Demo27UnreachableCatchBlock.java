package ExceptionHandling;

public class Demo27UnreachableCatchBlock {
    public static void main(String[] args) {
        try{
            System.out.println("10/0");
            String str=null;
            System.out.println(str.length());
        }catch (ArithmeticException arithmeticException){
            System.out.println("/ by zero ");
        }catch (NullPointerException nullPointerException){
            System.out.println("no operation are allowed on null ");
        }catch (Exception exception){
            System.out.println("generic handler");
        }
    }
}
