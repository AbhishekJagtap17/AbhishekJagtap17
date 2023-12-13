package operatorAssignment;

public class Operator07 {
    public static void main(String[] args) {
        int a=55;
        int b=70;
        //(a<50)==false  (a<b)==true
        System.out.println((a<50)&&(a<b));//false
        System.out.println((a<50)||(a<b));//true
        System.out.println((a<50)^(a<b));//true
    }
}
