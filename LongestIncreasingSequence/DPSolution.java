package LongestIncreasingSequence;

import java.util.Arrays;

public class DPSolution {
    public static int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        int res =0;
        Arrays.fill(dp, 1);
        for(int i = nums.length-1;i>=0;i--){
            for(int j=i;j<nums.length;j++){
                if(nums[i]<nums[j]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
            res= Math.max(res, dp[i]);
        }
        return res;
    }
    public static void main(String args[]){
        int[] arr = {1,3,6,7,9,4,10,5,6};
        System.out.println(lengthOfLIS(arr));
    }
}
