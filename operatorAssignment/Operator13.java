package operatorAssignment;

public class Operator13 {
    public static void main(String[] args) {
        int num=12345;
        num=num/10;
        int secondLastDigit=num%10;// Second last digit 4
        num/=10;
        int thirdLastDigit=num%10;
        num/=10;
        int secondDigit=num%10;
        num/=10;
        int firstDigit=num%10;
        System.out.println(secondLastDigit+firstDigit);//1+4=5
    }
}
