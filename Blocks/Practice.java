package Blocks;

public class Practice {

    public static int getFib(int n){
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 1;
        }
        return getFib(n - 1) + getFib(n - 2);
    }
    public static void main(String[] args) {
      Practice.getFib(10);
    }
}
