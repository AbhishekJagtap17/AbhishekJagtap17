package ClassObjectAssignment;

import MethodAssignment.Assignment02;

import java.util.Scanner;

public class Assignment04 {

    Assignment04(int side1,int side2,int side3){
        System.out.println("Perimeter : "+(side1+side2+side3));
        System.out.println("Area : "+(0.5f*side1*side2));
    }


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Assignment04 assignment04=new Assignment04(3,4,5);
    }
}
