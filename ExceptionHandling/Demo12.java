package ExceptionHandling;

public class Demo12 {
    public static void main(String[] args) {
        System.out.println("Value"+getValue());
    }
    public  static int  getValue(){
     try{
         return 1;
     }catch (Exception exception){
         return 2;
     }finally {
         return 3;
     }
     }
    }
