package Pattern;

public class Pattern09 {
    public static void main(String[] args) {
        int counter=1;
        for(int row=1;row<=10;row++){
            for(int column=1;column<=row;column++){
                System.out.print(counter++ +"\t");
            }
            System.out.println();
        }
    }
}
