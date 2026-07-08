import java.util.Arrays;

public class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int left=0;
        int right = nums.length-1;
        int[] result = new int[2];
        Arrays.sort(nums);
        while(left<=right){
            if(nums[left]+nums[right]==target){
                result[0]=left;
                result[1]=right;
            }
            else if (nums[left]+nums[right]>target) {
                right--;
            }
            else{
                left++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        Arrays.stream(twoSum(nums, 9)).forEach(System.out::print);
    }

}
