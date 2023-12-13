package Pattern;

public class Pattern08 {
    public static void main(String[] args) {
        for(int row=1;row<=9;row++){
            for(int column=1;column<=row;column++){
                System.out.print(row+" ");
            }
            System.out.println();
        }
    }
}
