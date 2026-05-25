import java.util.Collections;
import java.util.HashMap;

public class Solution {
    public static int minOpe(int[] nums){
        HashMap<Integer,Integer> map = new HashMap<>();
        HashMap<Integer,Integer> map1 = new HashMap<>();
        for(int i=0;i<nums.length;i=i+2){
             if (i % 2 == 0) {
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            } else {
                map1.put(nums[i], map1.getOrDefault(nums[i], 0) + 1);
            }
        }
        
        System.out.println(map);
        System.out.println(map1);
        return nums.length-Collections.max(map.values())+Collections.max(map1.values());

         
    }
    public static void main(String[] args){
        int[] nums={3,1,3,2,4,3};
        System.out.println(minOpe(nums));
    }
}
