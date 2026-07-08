package TopKthLargestElement;


import java.util.Collections;
import java.util.PriorityQueue;

public class Solution {
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for(int num:nums){
            queue.offer(num);
        }
        for(int i =0;i<k-1;i++){
            queue.poll();
        } 
        return queue.poll();
    }
    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        System.out.println(findKthLargest(nums, 2));
    }
}
