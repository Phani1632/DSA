package RotateImage;

import java.util.Arrays;

class Solution {
    public static void rotate(int[][] matrix) {
        int[][] result = new int[matrix[0].length][matrix.length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                result[j][matrix.length-1-i]=matrix[i][j];
                // System.out.println(j +" "+ (matrix.length-1-i));
            }
        }
        
        // matrix = result;
        for(int i = 0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
               matrix[i][j]=result[i][j];
            }
            
        }
        
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);
        for(int i = 0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.println(matrix[i][j]);
            }
            
        }
    }
}