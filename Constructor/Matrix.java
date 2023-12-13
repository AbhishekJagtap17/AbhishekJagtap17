package Constructor;

public class Matrix {
    int numberOfROws;
    int numberOfColumn;
    int [][]matrix;
    public Matrix(int numberOfROws,int numberOfColumn){
        this.numberOfROws=numberOfROws;
        this.numberOfColumn=numberOfColumn;
        this.matrix=new int[this.numberOfROws][this.numberOfColumn];
    }


    public static void main(String[] args) {
        Matrix matrix=new Matrix(5,5);
        System.out.println("Matrix Rows "+matrix.numberOfROws);
        System.out.println("Matrix Column "+matrix.numberOfColumn);
        System.out.println("Matrix "+matrix.matrix);
    }
}
