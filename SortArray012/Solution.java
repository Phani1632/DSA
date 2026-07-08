package SortArray012;

import java.util.Arrays;

public class Solution {
    public static void sort(int[] nums){
        int low=0;
        int mid=0;
        int high=nums.length-1;

        while(mid<=high){
            if(nums[mid]==0){
                swap(mid,low,nums);
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else if(nums[mid]==2){
                swap(mid, high,nums);
                high--;
            }
        }
    }
    public static void swap(int a, int b, int[] nums){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
    public static void main(String[] args){
        int[] nums = {1,0,1,0,2,1};
        sort(nums);
        Arrays.stream(nums).forEach(System.out::print);
    }
}   
