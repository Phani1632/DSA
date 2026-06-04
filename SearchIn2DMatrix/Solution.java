public class Solution {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int left=0;
        int down=matrix.length;
        int right = matrix[0].length;
        int i;
        for(i=0;i<down;i++){
            if(matrix[i][0]>target){
                break;
            }
        }       
        return search(left, right, matrix[i-1], target);      
    }
    public static boolean search(int left, int right,int[] matrix, int target){
        int mid = (left+right)/2;
        boolean result = false;
        while(left<right){
        if(matrix[mid]==target){
            return true;
        }
        else if(matrix[mid]<target){
           result= search(mid, right, matrix, target);
        }
        else{
            result=search(left, mid, matrix, target);
        }
    }
        return result;
    }
    public static void main (String args[]){
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(searchMatrix(matrix, 13));
    }
}
