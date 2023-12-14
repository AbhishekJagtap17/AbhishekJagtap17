package ExceptionHandling;

public class Demo10 {
    public static void main(String[] args) {
        {
            try {
                System.out.println(10/0);           //Arithmatic exception occurs divvide by zero.DEH print the exception details and terminate program .
                System.out.println("try");
            }finally {
                System.out.println("finally");         //statment inside finally block always executed even there are exception occurs or not
            }
            System.out.println("Rest of the main method");     //
        }
    }
}
