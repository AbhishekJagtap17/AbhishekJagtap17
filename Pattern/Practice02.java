package Pattern;

public class Practice02 {
    public static void main(String[] args) {

        int n = 4;

        for (int row = 1; row <= n; row++) {
            for (int spaces = 1; spaces <= (n - row); spaces++) {
                System.out.print(" ");
            }

            for(int column=1;column<=row;column++){
                System.out.print(column);
            }

            for(int number=(row-1);number>=1;number--){
                System.out.print(number);
            }
            System.out.println();
        }

        for (int row = n; row >= 1; row--) {

            for (int spaces = 1; spaces <= (n - row); spaces++) {
                System.out.print(" ");
            }

            for(int column=1;column<=row;column++){
                System.out.print(column);
            }

            for(int number=(row-1);number>=1;number--){
                System.out.print(number);
            }
            System.out.println();
        }
    }
}