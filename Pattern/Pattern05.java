package Pattern;

public class Pattern05 {
    public static void main(String[] args) {
        for(int row=1;row<=5;row++){
            for(int spaces=1;spaces<row;spaces++){
                System.out.print(" ");
            }
            for(int column=5;column>=row;column--){
                System.out.print(6-row+" ");
            }
            System.out.println();
        }
    }
}
