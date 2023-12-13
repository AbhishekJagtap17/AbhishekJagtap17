package operatorAssignment;

import java.util.Scanner;

public class Operator01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
      /*  int l=5;
        int b=7;
        int area=l*b;
        int perimeter=2*(l+b);
        System.out.println("Area of rectangle :"+area);
        System.out.println("Perimeter  of rectangle :"+perimeter);   */
        int a=2;byte b=3;short c=5;
        byte perimeter=(byte)(a+b+c);
        System.out.println("Perimeter of triangle :"+perimeter);
    }
}
