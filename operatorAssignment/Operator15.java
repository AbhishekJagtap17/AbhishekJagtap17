package operatorAssignment;

public class Operator15 {
    public static void main(String[] args) {
        int num=132;
        int digit=num%10;
        num/=10;
        int digitTwo=num%10;
        num/=10;
        int digitFirst=num%10;
        int revNo=digit;
        revNo=revNo*10+digitTwo;
        revNo=revNo*10+digitFirst;

       int sum=(digitFirst+digitTwo+digit);
          System.out.println("Sum of Digit in number 132 is :"+sum);

        System.out.println("Reversed no of 132 is :"+revNo);
    }
}
