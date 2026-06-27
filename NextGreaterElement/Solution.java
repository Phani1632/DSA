package NextGreaterElement;

import java.util.Arrays;

public class Solution {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        Arrays.fill(result, -1);
        for(int i =0; i< nums1.length;i++){
            int flag=0;
            for(int j=0;j<nums2.length;j++){
                if(flag!=0){
                    if(nums2[j]>nums1[i]){
                        result[i]=nums2[j];
                        break;
                    } 
                }
                if(nums1[i]==nums2[j]){
                    flag=1;
                }
            }
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
