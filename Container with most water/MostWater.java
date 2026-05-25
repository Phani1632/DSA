public class MostWater {
    public static int solution(int[] nums){
        int amount =0;
        int result=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                amount =Math.max(Math.min(nums[i],nums[j])*(j-i),amount);
            }
            result=Math.max(amount, result);
        }
        return result;
    }
    public static void main(String[] args) {
        int [] nums = {8,7,2,1};
        System.out.println(solution(nums));
    }
}
