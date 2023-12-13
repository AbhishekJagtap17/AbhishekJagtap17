package operatorAssignment;

public class Operator10 {
    public static void main(String[] args) {
        int a=6;
        int b=8;
        int temp;
        System.out.println("Before Swapping");
        System.out.println(a) ;
        System.out.println(b);
      /*  temp=a;
        a=b;
        b=temp;    */
        a=a+b;//14
        b=a-b;//6
        a=a-b;//8

        System.out.println("After  Swapping");
        System.out.println(a) ;
        System.out.println(b);


    }
}
