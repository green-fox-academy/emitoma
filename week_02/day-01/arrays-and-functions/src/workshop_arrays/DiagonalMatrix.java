package workshop_arrays;

import java.util.Arrays;

public class DiagonalMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];

        for (int i = 0; i < matrix.length ; i++) {
            matrix[i][i] = 1;
            System.out.println(Arrays.toString(matrix[i]));
        }

    }
}
