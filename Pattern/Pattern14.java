package Pattern;

public class Pattern14 {
    public static void main(String[] args) {
        int n=20;
        for(int row=20;row>=1;row--){
            for(int column=1;column<=row;column++){
                System.out.print(column+" ");
            }
            System.out.println();
        }
    }
}
