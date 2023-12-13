package Pattern;

public class Pattern20 {
    public static void main(String[] args) {
        int n=5;
        for(int row=5;row>=1;row--){
           for(int spaces=1;spaces<=(n-row);spaces++){
               System.out.print(" ");
           }
           for(int column=row;column>=1;column--){
               System.out.print(column+" ");
           }
            System.out.println();
        }
    }
}
