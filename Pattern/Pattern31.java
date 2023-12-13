package Pattern;

public class Pattern31 {
    public static void main(String[] args) {
        for(int row=1;row<=5;row++){
            for(int column=1;column<=10;column++){
                if(row==1||column==10||row==5||column==1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
