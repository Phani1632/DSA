package MatrixBlockSum;

public class Solution {
    public static  int[][] matrixBlockSum(int[][] mat, int k) {
        int[][] result = new int[mat.length][mat[0].length];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                result[i][j]=sum(mat,i,j,k);
            }
        }
        return result;
    }
    public static int sum(int[][] mat, int row, int col, int k){
        int rowStart, rowEnd, colStart,colEnd;
        int sum=0;
        rowStart = (row-k<0)? 0: row-k; 
        rowEnd = (row+k+1>mat.length)? mat.length:row+k+1;
        colStart = (col-k<0)? 0: col-k; 
        colEnd = (col+k+1>mat[0].length)? mat[0].length:col+k+1;
        for(int i=rowStart;i<rowEnd;i++){
            for(int j=colStart;j<colEnd;j++){
                sum+=mat[i][j];
            }
        }
        return sum;
    }
    public static void main(String[] args){
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] result = matrixBlockSum(mat, 1);
        for(int i=0;i<result.length;i++){
            for(int j=0;j<result[0].length;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    } 
}
