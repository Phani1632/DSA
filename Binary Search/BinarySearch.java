public class BinarySearch {
    public static int search(int[] nums, int target){
        int left=0;
        int right = nums.length-1;        
        while(left<=right){
            int mid = (left + right)/2;
            if(nums[mid]==target){
                return mid;
            }
            else{
                if(nums[left]<target && target < nums[mid]){
                    right =mid-1;
                }
                else if(nums[mid]<target && target<nums[right]){
                    left = mid+1;
                }
            }
        }
        return 0;
    }
    public static void main(String args[]){
        int[] nums={1,2,3,4,5};
        System.out.println(search(nums, 3));
    }
}
