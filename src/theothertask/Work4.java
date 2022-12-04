package theothertask;

public class Work4 {
    public static void main(String[] args) {
        int sum = 0;
        int[][] matrix = {{2, 0}, {3, 3}};
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix.length; j++) {
                sum += ints[j];
            }
        }
        System.out.println("\nSum of matrix elements=" + sum + ";");
    }
}