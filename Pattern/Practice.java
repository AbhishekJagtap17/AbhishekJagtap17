package Pattern;

public class Practice {
    public static void main(String[] args) {
        int n = 4;
        int row=9;

        while (row>=1){
            int column=row;
            while(column>=1){
                if(column==9){
                    System.out.print("6");
                } else if (column==6) {
                    System.out.print("9");
                }else {
                    System.out.print(column);
                }
                column--;
            }
            System.out.println();
            row--;
        }
    }
}
