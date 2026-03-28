import java.util.Arrays;

public class Matrices {
    public static void setZeros(int[][] matrix) {
        int rows = matrix.length;
        // int [] a = matrix[1];
        // for(int i:a){
        // System.out.println(i);
        // }
        // System.out.println(rows);
        int columns = matrix[0].length;
        int[][] result = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            result[i] = Arrays.copyOf(matrix[i], columns);
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] == 0) {
                    Arrays.fill(result[i], 0);
                    for (int p = 0; p < rows; p++) {
                        result[p][j] = 0;
                    }
                }
            }
        }
        System.out.println(Arrays.deepToString(result));
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
        setZeros(matrix);
    }
}
