package ExceptionHandling;

public class Demo05 {
    public static void main(String[] args) {
        try{
            String str=null;
            System.out.println(str.length());            //NullPointerException occurs

        }catch(NullPointerException nullPointerException){
            System.out.println("No operation are allowed on null ");     //Execute statment in nullPointerException object.
                                           //Again arithmaticException occurs but there is no object .
                                                                        //so default Exception handler print project detail and terminate program
        }finally {
            System.out.println(10/0);
            System.out.println("Closing the database connections");    //Finally block always excted even there are exception occurs or not.
        }

        System.out.println("Rest of the main method");
    }
}
