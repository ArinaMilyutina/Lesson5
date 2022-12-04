package theothertask;

import java.util.Arrays;

public class Work7 {
    public static void main(String[] args) {
        int[][] matrix;
        matrix = new int[7][7];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (j >= i && i + j < matrix.length) {
                    matrix[i][j] = 0;
                } else if (j <= i && i + j + 2 > matrix.length) {
                    matrix[i][j] = 0;
                } else {
                    matrix[i][j] = 1;
                }
            }
        }
        System.out.println(Arrays.deepToString(matrix).replace("], ", "]\n"));
    }
}


