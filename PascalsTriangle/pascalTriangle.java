package PascalsTriangle;

import java.util.Arrays;

public class pascalTriangle {

    public static void answer(int r,int c){
        int[][] matrix = new int[r][r];
        matrix[0][0]=1;
        for(int i=1;i<r;i++){
            for(int j=0;j<i+1;j++){
                if(j==0){
                    matrix[i][j]=matrix[i-1][j];
                }
                else if(j==i){
                    matrix[i][j]=matrix[i-1][i-1];
                }
                else{
                    matrix[i][j]=matrix[i-1][j]+matrix[i-1][j-1 ];
                }
            }
        }
        System.out.println(matrix[r-1][c-1]);
        System.out.print(Arrays.deepToString(matrix));
    }
    public static void main(String args[]){
        // answer(2, 1);
        answer(5,2);
    }
}
