package Pattern;

public class Pattern27 {
    public static void main(String[] args) {
        int n=9;
        int counter=1;
        for(int row=1;row<=9;row++) {
            for(int spaces=1;spaces<=(n-row);spaces++){
                System.out.print("  ");
            }
            for(int column=row;column>=1;column--){
                System.out.print(column+" ");
            }
            for(int star=2;star<=row;star++){
                System.out.print(star+" ");
            }
            System.out.println();
        }
    }
}
