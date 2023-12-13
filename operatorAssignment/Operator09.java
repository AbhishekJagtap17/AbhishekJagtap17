package operatorAssignment;

public class Operator09 {
    public static void main(String[] args) {
        int sub1=78;
        int sub2=45;
        int sub3=62;

        int totalmarks=(sub1+sub2+sub3);
        float percentage=((totalmarks)/300.0f)*100;

        System.out.println("Total marks out of 300 is "+totalmarks);
        System.out.println("Percentage of three subject is "+percentage);
    }
}
