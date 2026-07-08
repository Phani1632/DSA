package JumpGame;

public class Solution {
    public static boolean canJump(int[] nums) {
        if(nums[0]>=nums.length){
            return true;
        }
        
       return check(nums, 0); 
    }
    public static boolean check(int[] nums, int position){
        boolean result= false;
        if(position>=nums.length-1){
            return true;
        }
        else {
            for(int i =1 ; i<=nums[position] ;i++){
                result =result||check(nums, position+i);
                if(result){
                    return result;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(canJump(nums));
    }
}
