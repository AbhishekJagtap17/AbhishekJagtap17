package ExceptionHandling;

public class Demo22 {
    public static void main(String[] args) {
        try{
            System.out.println("try");
            System.exit(0);                              //Counter goes outside the program and execution will be normally
        }catch (Exception exception){
            System.out.println("Catch");
        }finally {                                              //Even statment inside finally block will not be executed.
            System.out.println("finally");
        }
        System.out.println("1");
        System.out.println("2");
    }
}
