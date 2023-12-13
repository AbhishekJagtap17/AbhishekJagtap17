package Pattern;

public class Pattern28 {
    public static void main(String[] args) {
        int n=9;
        for(int row=1;row<=9;row++){
            for(int column=1;column<=row;column++) {
            //    int sum=row+column;
                if ((row+column)%2==0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
