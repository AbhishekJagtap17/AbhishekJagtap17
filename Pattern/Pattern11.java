package Pattern;

public class Pattern11 {
    public static void main(String[] args) {
        for(int row=1;row<=10;row++){
            for(int spaces=1;spaces<=10-1;spaces--){
                System.out.print(" ");
            }
            for(int column=1;column<=row;column++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
