import java.util.Arrays;

public class setZeros {

    public static void process(int[][] matrix){
        int rows = matrix.length;
        int columns = matrix[0].length;
        int [] rowChecker= new int[rows];
        int [] columnChecker = new int[columns];
        Arrays.fill(rowChecker,0);
        Arrays.fill(columnChecker,0);
        for(int i=0;i<rows;i++){
            for(int j=0;j<rows;j++){
                if(matrix[i][j]==0){
                    rowChecker[i]=1;
                    columnChecker[j]=1;
                }
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<rows;j++){
                if(rowChecker[i]==1 || columnChecker[j]==1){
                    matrix[i][j]=0;
                }
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }
    public static void main(String[] args) {
        int[][] matrix = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
        process(matrix);
    }
}
