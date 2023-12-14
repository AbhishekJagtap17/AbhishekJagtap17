package ExceptionHandling;

//System.exit() statement taken out the counter outside the program after printing initial statement at that line.
//It could not be any  execution after that statment.

public class Demo21 {
    public static void main(String[] args) {
        System.out.println("1");
         System.exit(0);
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");

    }
}
