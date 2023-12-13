package Pattern;

public class Pattern30 {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 5; row >= 1; row--) {
            for (int spaces = 1; spaces <= row; spaces++) {
                System.out.print("  ");
            }
            for (int column = 5; column >= row; column--) {
                if (column == 5|| row == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            for (int column = 4; column >= row; column--) {
                if ( row == 1|| row == column ) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}


