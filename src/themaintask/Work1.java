package themaintask;

import java.util.Arrays;
import java.util.Scanner;

public class Work1 {
    public static void main(String[] args) {
        System.out.println("Enter the number,please.");
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            System.out.println("Error!!!Enter the number,please.");
            scanner.nextLine();
        }
        int number = scanner.nextInt();
        int[][][] array3 = {{{1, 1, 1}, {2, 2, 2}}, {{3, 3, 3}}};
        System.out.println(Arrays.deepToString(array3));
        for (int a = 0; a < array3.length; a++) {
            for (int b = 0; b < array3[a].length; b++) {
                for (int c = 0; c < array3[a][b].length; c++) {
                    array3[a][b][c] += number;
                }
            }
        }
        System.out.println(Arrays.deepToString(array3));
    }
}