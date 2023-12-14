package ExceptionHandling;

public class Demo08 {
    public static void main(String[] args) {
        try{
        String str=null;
        System.out.println(str.length());
        }catch (NullPointerException nullPointerException){
            System.out.println("No operations are allowed on null");
        }
        finally {
            System.out.println("closing the database connection");
        }
        System.out.println("rest of the main method");
        }
}
