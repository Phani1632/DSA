import java.util.Arrays;

public class setZeroSpaceO {
    public static void process(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int column0 = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] == 0) {
                    if (j != 0) {
                        matrix[0][j] = 0;
                    } else {
                        column0 = 0;
                    }
                    matrix[i][0] = 0;
                }
            }
        }
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < columns; j++) {
                if (matrix[0][j] == 0 || matrix[i][0] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
        if (matrix[0][0] == 0) {
            Arrays.fill(matrix[0], 0);
        }
        if (column0 == 0) {
            for (int j = 0; j < rows; j++) {
                matrix[0][j] = 0;
            }
        }

        System.out.println(Arrays.deepToString(matrix));
    }

    public static void main(String[] args) {
        int[][] matrix = { { 0, 1, 1, 0 }, { 1, 0, 1, 1 }, { 1, 1, 1, 1 } };
        process(matrix);
    }
}
