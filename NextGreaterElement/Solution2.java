package NextGreaterElement;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution2 {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        Map<Integer,Integer> map= new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for(int num: nums2){
            while(!stack.isEmpty() && num>stack.peek()){
                map.put(stack.pop(),num);
            }
            stack.push(num);
        }
        while(!stack.isEmpty()){
            map.put(stack.pop(), -1);
        }
        for(int i=0;i<result.length;i++){
            result[i]=map.get(nums1[i]);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums1={4,1,2};
        int[] nums2={1,3,4,2};

        int[] result = nextGreaterElement(nums1,nums2);
        Arrays.stream(result).forEach(System.out::print);
    }
}
