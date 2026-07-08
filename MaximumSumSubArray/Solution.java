package MaximumSumSubArray;

import java.util.Arrays;

public class Solution {
    public static  int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int i = 0 ;i <nums.length;i++){
            if(i>0 && nums[i-1]>0){
                nums[i]=nums[i-1]+nums[i];
            }
            max = Math.max(max, nums[i]); 
        }
        return max;
    }
    public static void main(String[] args) {
        int[] nums = {5,4,-1,7,8};
        System.out.println(maxSubArray(nums));
        Arrays.stream(nums).forEach(System.out::print);
    }
}
