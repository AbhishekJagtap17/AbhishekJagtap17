package Pattern;

public class Pattern32 {
    public static void main(String[] args) {
        int n=10;
        for(int row=1;row<=10;row++){
            for(int column=1;column<=row;column++){
                if(column==1||row==10||row==column){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
