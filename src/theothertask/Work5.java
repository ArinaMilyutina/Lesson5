package theothertask;

public class Work5 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
        int size = 3;
        System.out.println("Side diagonal: ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(matrix[i][size - i - 1] + " ");
        }
        System.out.println("Major diagonal: ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(matrix[i][i] + " ");
        }
    }
}

