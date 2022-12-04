package themaintask;

import java.util.Arrays;

public class Work2 {
    public static void main(String[] args) {
        String[][] array2;
        array2 = new String[8][8];
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[0].length; j++) {
                if ((i + j) % 2 == 0) {
                    array2[i][j] = "W";
                } else {
                    array2[i][j] = "B";
                }
            }

        }
        System.out.println(Arrays.deepToString(array2).replace("], ", "]\n"));
    }
}
