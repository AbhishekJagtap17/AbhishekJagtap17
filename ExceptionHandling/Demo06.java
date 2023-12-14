package ExceptionHandling;

public class Demo06 {
    public static void main(String[] args) {
        try{
            String str="null";
            System.out.println(str.length());             //4

        }catch(NullPointerException nullPointerException){             //Exception does not occurs at try block then there no any object cretion
                                        //Counter does not go inside catch block program run fine even there are arithmatic exceotion occur.
            System.out.println("No operation are allowed on null ");      //these statment cannot be executed.
            System.out.println(10/0);

        }finally {
            System.out.println("Closing the database connections");    //Finally block always excted even there are exception occurs or not.
        }

        System.out.println("Rest of the main method");
    }
}
