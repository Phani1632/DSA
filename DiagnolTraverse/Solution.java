package DiagnolTraverse;

import java.util.Arrays;

public class Solution {
    public static int[] findDiagonalOrder(int[][] mat) {
        int[] result = new int[mat.length * mat[0].length];
        int row = 0;
        int col = 0;
        int count = 0;
        boolean up=true;
        while (true) {
            if(row == mat.length-1 && col == mat[0].length-1){
                break;
            }
            if (col == 0 && row == 0) {
                result[count] = mat[row][col];
                col++;
                up = false;
                
            } else {
                if (row == 0) {
                    if (up == false) {
                        while(col != 0 && row!=mat.length){
                            count++;
                            result[count] = mat[row][col];
                            col--;
                            row++;
                        }
                        up = true;
                    }
                    else{
                        if(col<mat[0].length-1){
                            count++;
                            result[count] = mat[row][col];
                            col++;
                        }
                        else{
                            count++;
                            result[count] = mat[row][col];
                            row++;
                        }
                    }
                }
                else if(col==0){
                    if(up ==false){
                        while(col!=mat[0].length && row!= 0){
                            count++;
                            result[count] = mat[row][col];
                            col++;
                            row--;
                        }
                        up = false;
                    }
                    else{
                        if(row<mat.length-1){
                            count++;
                            result[count] = mat[row][col];
                            row++;
                        }
                        else{
                            count++;
                            result[count] = mat[row][col];
                            col++; 
                        }
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        int[] result = findDiagonalOrder(mat);
        Arrays.stream(result).forEach(System.out::print);
    }

}
