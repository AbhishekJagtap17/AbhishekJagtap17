package ExceptionHandling;

public class Demo03 {
    public static void main(String[] args) {
        try{
        String str="null";
        System.out.println(str.length());
         }catch (NullPointerException nullPointerException) {
            System.out.println("No operation are allowed on null");
        }
            System.out.println("Rest of the main method");
        }
}
