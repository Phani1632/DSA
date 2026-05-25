public class PivotIndexOp {
    public static int solution(int[] nums) {
        int low = 0, high = nums.length - 1;
        int sum1 = 0;
        for(int i=1;i<nums.length;i++){
            sum1=sum1+nums[i];
        }
        if(sum1==0){
            return 0;
        }
        int sum2 = 0;
        for(int i=0;i<nums.length-1;i++){
            sum2=sum2+nums[i];
        }
        if(sum2==0){
            return nums.length-1;
        }
        sum1=nums[low];
        sum2=nums[high];
        while (low < high) {
            if (sum1 < sum2) {
                low++;
                sum1 = sum1 + nums[low];
            } else if (sum1 > sum2) {
                high--;
                sum2 = sum2 + nums[high];
            } else {
                if (low + 1 == high - 1) {
                    return low + 1;
                }
                low++;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int[] nums = {-1,-1,-1,-1,-1,0};
        System.out.print(solution(nums));
    }
}
