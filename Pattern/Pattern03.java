package Pattern;

public class Pattern03 {
    public static void main(String[] args) {
        for(int row=1;row<=10;row++){
            for(int column=20;column<=40;column++){
                System.out.print(row*column+"\t");
            }
            System.out.println();
        }
    }
}
