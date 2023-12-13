package Pattern;

public class Pattern26 {
    public static void main(String[] args) {
        int n=6;
        for(int row=1;row<=6;row++){
            for(int spaces=1;spaces<=(row-1);spaces++) {
                System.out.print(" ");
            }
            for(int column=row;column<=n;column++){
                System.out.print(column+ " ");
            }
            System.out.println();
        }

        for(int row=5;row>=1;row--){
            for(int spaces=1;spaces<=(row-1);spaces++) {
                System.out.print(" ");
            }
            for(int column=row;column<=n;column++){
                System.out.print(column+ " ");
            }
            System.out.println();
        }
    }
}
