package Pattern;

public class Pattern15 {
    public static void main(String[] args) {
        int n=6;
        for(int row=6;row>=1;row--)
        {
            for(int column=1;column<=row;column++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
