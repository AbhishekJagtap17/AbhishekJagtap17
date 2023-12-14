package ExceptionHandling;

public class Demo26NumberFormatException {
    public static void main(String[] args) {
        String str="123465a";
        int i=Integer.valueOf(str);
        System.out.println(i);
    }
}
