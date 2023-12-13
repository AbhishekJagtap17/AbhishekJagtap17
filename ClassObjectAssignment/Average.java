package ClassObjectAssignment;

import java.util.Scanner;
public class Average {
    int number1;
    int number3;
    int number2;
    float toCalculateAverage(int n1,int n2,int n3){
        number1=n1;
        number2=n2;
        number3=n3;
        return (n1+n2+n3)/3.0f;
    }
    void printAverage(){
        System.out.println("Average is "+toCalculateAverage(number1,number2,number3));
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Average average=new Average();
        int number1= scanner.nextInt();
        int number2= scanner.nextInt();
        int number3= scanner.nextInt();

        average.toCalculateAverage(number1,number2,number3);
        average.printAverage();
    }
}
