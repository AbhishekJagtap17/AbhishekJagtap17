package ClassObjectAssignment;

import java.awt.*;
import java.util.Scanner;
public class Triangle {
    int side1;
    int side2;
    int side3;

    int getPerimeter(){
        return side1+side2+side3;
    }
    float getArea()
    {
        return 0.5f*side1*side2;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Triangle triangle=new Triangle();
        triangle.side1=3;
        triangle.side2=4;
        triangle.side3=5;

        System.out.println("Perimeter of triangle : "+triangle.getPerimeter());
        System.out.println("Area of triangle :"+triangle.getArea());
    }
}
