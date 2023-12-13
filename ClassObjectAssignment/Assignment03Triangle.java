package ClassObjectAssignment;

import java.util.Scanner;

public class Assignment03Triangle {
    int side1;
    int side2;
    int side3;

    Assignment03Triangle(int s1,int s2,int s3){
      side1=s1;
      side2=s2;
      side3=s3;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Assignment03Triangle a02=new Assignment03Triangle(3,4,5);
        System.out.println("Area of Triangle :"+(0.5* a02.side1* a02.side2));
        System.out.println("Perimeter of Triangle : "+(a02.side1+a02.side2+a02.side3));
    }
}
