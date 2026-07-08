package Sum2;

import java.util.Arrays;
import java.util.HashMap;

public class Solution2 {
    public static int[] twoSum(int[] nums, int target) {
        
        int[] result = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            int req = target - nums[i];
            if(map.containsKey(req)){
                result[0]=map.get(req);
                result[1]=i;
            }
            map.put(nums[i], i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        Arrays.stream(twoSum(nums, 9)).forEach(System.out::print);
    }

}
