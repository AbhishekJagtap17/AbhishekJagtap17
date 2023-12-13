package ClassObjectAssignment;

import java.util.Scanner;


public class Assignment05Rectangle {
    int length;
    int breadth;
    Assignment05Rectangle(int l,int b){
        breadth=b;
        length=l;
    }
    int area(){
        return length*breadth;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Assignment05Rectangle rectangle01=new Assignment05Rectangle(4,5);
        Assignment05Rectangle rectangle02=new Assignment05Rectangle(5,8);
        System.out.println("Area : "+rectangle01.area());
        System.out.println("Area : "+rectangle02.area());
    }
}
