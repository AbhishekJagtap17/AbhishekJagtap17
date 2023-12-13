package Constructor;

import java.util.Scanner;

public class Rectangle {
    int length;
    int breadth;
    Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    int area(){
        return length*breadth;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Rectangle rectangle=new Rectangle(4,6);
        System.out.println("Area : "+rectangle.area());
    }
}
