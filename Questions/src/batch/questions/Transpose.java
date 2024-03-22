package batch.questions;

public class Transpose {
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] transpose(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] ma = new int[n][m];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                ma[j][i] = mat[i][j];
            }
        }
        return ma;
    }
    public static void main(String[] args) {
        int[][] originalMatrix = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int[][] transposedMatrix = transpose(originalMatrix);
        printMatrix(transposedMatrix);
    }
}
