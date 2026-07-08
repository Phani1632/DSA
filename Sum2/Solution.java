package Sum2;
import java.util.Arrays;


//for sortedarray
public class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int left=0;
        int right = nums.length-1;
        int[] result = new int[2];
        while(left<=right){
            if(nums[left]+nums[right]==target){
                result[0]=left;
                result[1]=right;
                break;            }
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
