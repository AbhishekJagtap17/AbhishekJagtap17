package Pattern;

public class Pattern29 {
    public static void main(String[] args) {
        int n = 5;  //No. of row
        for (int row = 5; row >= 1; row--) {
                for (int column = row; column >= 1; column--) {
                    System.out.print(column + " ");
                }
                for (int spaces = 1; spaces <=(n - row); spaces++) {
                    System.out.print("  ");
                }
                for (int spaces = 2; spaces <=(n - row); spaces++) {
                    System.out.print("  ");
                }
                for(int column=1;column<=row;column++){
                    if(column==1&&row==5)
                        continue;
                    System.out.print(column+" ");
                }
                System.out.println();
            }
        }
}

