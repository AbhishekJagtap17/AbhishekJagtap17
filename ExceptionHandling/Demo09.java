package ExceptionHandling;

public class Demo09 {
    public static void main(String[] args) {
        try {
            System.out.println(10/0);
            System.out.println("try");
        }catch (Exception exception){
            System.out.println("catch");
        }finally {
            System.out.println("finally");
        }
        System.out.println("Rest of the main method");
    }
}
