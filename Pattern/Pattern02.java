package Pattern;

public class Pattern02 {
    public static void main(String[] args) {
        int startRange=20;
        int endRange=40;
        for(int i=startRange;i<=endRange;i++){
            for(int column=1;column<=10;column++){
                System.out.print(i*column+ "\t ");
            }
            System.out.println();
        }
    }
}
