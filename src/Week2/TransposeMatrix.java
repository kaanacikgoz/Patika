package Week2;


public class TransposeMatrix {

    public static void main(String[] args) {

        int[][] matrix = {{1,2,3},{4,5,6}}; // Original Matrix
        showMatrix(matrix);
        makeTranspose(matrix);
    }

    // This method show transpose of matrix entered by user
    static void makeTranspose(int[][] matrix) {
        int[][] transpose = new int[matrix[0].length][matrix.length];
        for (int i=0;i<matrix.length;i++) {
            for (int j=0;j<matrix[i].length;j++) {
                transpose[j][i] = matrix[i][j]; // Column-Row -> Row-Column (i=Row)(j=Column)
            }
        }
        System.out.println("Transpose of this matrix is:");
        for (int[] row:transpose) {
            for (int column:row) {
                System.out.print(column+" ");
            }
            System.out.println();
        }
    }

    // This method show the matrix entered by user
    static void showMatrix(int[][] matrix) {
        System.out.println("Matrix is:");
        for (int[] row:matrix) {
            for (int column:row) {
                System.out.print(column+" ");
            }
            System.out.println();
        }
    }

}
