package Pattern;

public class Pattern24 {
    public static void main(String[] args) {
        int n=5;
        for(int row=1;row<=5;row++){
            for(int spaces=1;spaces<=(n-row);spaces++){
                System.out.print("  ");
            }
            for(int column=1;column<=row;column++){
                System.out.print("* ");
            }
            for(int k=2;k<=row;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}