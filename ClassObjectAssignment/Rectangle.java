package ClassObjectAssignment;

import java.util.Scanner;

public class Rectangle {
    int length;
    int breadth;

    void setDia(int localLength,int localBreadth){
        length=localLength;
        breadth=localBreadth;
    }
    int getArea(){

        return length*breadth;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Rectangle rectangle=new Rectangle();
        System.out.println("Enter length and Breadth :");
        int length=scanner.nextInt();
        int breadth=scanner.nextInt();
        rectangle.setDia(length,breadth);
        System.out.println("Area of rectangle is: "+rectangle.getArea());
    }
}
