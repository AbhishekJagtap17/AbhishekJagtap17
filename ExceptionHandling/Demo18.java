package ExceptionHandling;

public class Demo18 {
    static {
        System.out.println("Demo 18 class is loaded in memory with the help of forname method");
    }

    public static void main(String[] args) {
        try{
            m1();
        }catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            System.out.println("Invalid Denominator");
        }
        System.out.println("Rest of the main method");
    }
    public static void m1(){
        m2();
    }
    public static void m2(){
        m3();
    }
    public static void m3(){
        System.out.println(10/0);
    }
}
