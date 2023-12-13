package Constructor;

import java.util.Scanner;

public class Triangle {
   int  side1;
   int side2;
   int side3;
   Triangle(int s1,int s2,int s3){
       side1=s1;
       side2=s2;
       side3=s3;
   }

   public static void main(String[] args) {
      Scanner scanner=new Scanner(System.in);
      Triangle triangle=new Triangle(3,4,5);
      System.out.println("Area of Traingle :"+(0.5* triangle.side1* triangle.side2));
      System.out.println("Perimeter OF Traingle :"+(triangle.side1+ triangle.side2+ triangle.side3));
   }
}
