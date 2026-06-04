public class Solution2 {
public static boolean searchMatrix(int[][] matrix, int target) {
        int left = 0;
        int down = matrix.length;
        int right = matrix[0].length-1;
        int i;
        for (i = 0; i < down; i++) {
            if (matrix[i][0] > target) {
                break;
            }
        }
        if(i==0){
            i=1;
        }
        boolean result = false;
        while (left <= right) {
            int mid =  left + (right - left) / 2;
            if (matrix[i-1][mid] == target) {
                return true;
            } 
            if (matrix[i-1][mid] < target) {
                left=mid+1;
            } else {
                right= mid-1;
            }
        }
        return result;
    }


    public static void main(String args[]) {
        int[][] matrix = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
        System.out.println(searchMatrix(matrix, 13));
    }
}
