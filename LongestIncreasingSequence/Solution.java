package LongestIncreasingSequence;

public class Solution {
    public static int lengthOfLIS(int[] nums) {
       int count =0;
       for(int i=0;i<nums.length;i++){
        int start = nums[i];
        int currentCount=1;
        for(int j=i;j<nums.length;j++){
            if(start<nums[j]){
                start = nums[j];
                currentCount++;
            }
        }
        count=Math.max(count, currentCount);
       }
        return count;
    }
    public static void main(String args[]){
        int[] arr = {10,9,2,5,3,7,101,18};
        System.out.println(lengthOfLIS(arr));
    }
}
