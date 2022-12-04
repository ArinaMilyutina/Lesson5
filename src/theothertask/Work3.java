package theothertask;

public class Work3 {
    public static void main(String[] args) {
        int[][] matrix1 = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        int[][] matrix2 = {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}};
        int[][] matrix3 = new int[matrix1.length][matrix2.length];
        for (int i = 0; i < matrix3.length; i++) {
            for (int j = 0; j < matrix3.length; j++) {
                for (int k = 0; k < matrix1.length; k++) {
                    matrix3[i][j] = matrix3[i][j] + matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        for (int[] ints : matrix3) {
            for (int j = 0; j < matrix3.length; j++) {
                System.out.print(" " + ints[j] + " ");
            }
            System.out.println();
        }
    }
}
