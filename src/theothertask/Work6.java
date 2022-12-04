package theothertask;

import java.util.Arrays;

public class Work6 {
    public static void main(String[] args) {
        int[][] matrix = {{9, 0, 12}, {10, 100, 8}, {11, 1, 0}};
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix.length; j++) {
                Arrays.sort(ints);
            }
        }
        System.out.println(Arrays.deepToString(matrix).replace("], ", "]\n"));
    }
}
