package Pattern;

public class Pattern12 {
    public static void main(String[] args) {
        int n=6;
        for(int row=1;row<=6;row++){
            for(int spaces=1;spaces<=(6-row);spaces++){
                System.out.print("  ");
            }
            for(int column=1;column<=row;column++){
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
}
