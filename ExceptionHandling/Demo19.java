package ExceptionHandling;

public class Demo19 {
    public static void main(String[] args) {
        try{
            Class.forName("exception handling.Demo18");
        }catch (ClassNotFoundException e){
            System.out.println("Class is invalid");
        }
    }
}
