package DiagnolTraverse;

import java.util.Arrays;

public class Solution2 {
    public static int[] findDiagonalOrder(int[][] mat) {
        int[] result = new int[mat.length * mat[0].length];
        int row = 0;
        int col = 0;
        int count = 0;
        if(mat.length==1){
            for(int i=0;i<mat[0].length;i++){
                result[i]=mat[0][i];
            }
            return result;
        }
        if(mat[0].length==1){
            for(int i=0;i<mat.length;i++){
                result[i]=mat[i][0];
            }
            return result;
        }
        while (true) {
            if (row == mat.length-1  && col == mat.length-1) {
                count++;
                result[count] = mat[row][col];
                break;
            }
            if (col == 0 && row == 0) {
                result[count] = mat[row][col];
                col++;

            } else {
                if (row == 0 || col == mat[0].length-1) {

                    while (col != 0 && row != mat.length-1) {
                        count++;
                        result[count] = mat[row][col];
                        col--;
                        row++;
                    }
                    if (row < mat.length - 1) {
                        count++;
                        result[count] = mat[row][col];
                        row++;
                    } else {
                        count++;
                        result[count] = mat[row][col];
                        col++;
                    }

                }

                else if (col == 0 || row == mat.length-1) {

                    while (col != mat[0].length-1 && row != 0) {
                        count++;
                        result[count] = mat[row][col];
                        col++;
                        row--;
                    }
                    if (col < mat[0].length - 1) {
                        count++;
                        result[count] = mat[row][col];
                        col++;
                    } else {
                        count++;
                        result[count] = mat[row][col];
                        row++;
                    }

                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[] result = findDiagonalOrder(mat);
        Arrays.stream(result).forEach(System.out::print);
    }

}
