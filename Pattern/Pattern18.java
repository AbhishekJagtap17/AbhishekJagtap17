package Pattern;

public class Pattern18 {
    public static void main(String[] args) {
        int n=5;

        for(int row=1;row<=5;row++){
            for(int spaces=1;spaces<=(n-row);spaces++){
                System.out.print(" ");
            }
            for(int column=1;column<=row;column++){
                System.out.print(row+" ");
            }
            System.out.println();
        }
        for(int row=4;row>=1;row--){
            for(int spaces=1;spaces<=(n-row);spaces++){
                System.out.print(" ");
            }
            for(int column=1;column<=row;column++){
                System.out.print(row+" ");
            }
            System.out.println();
        }
    }
}
