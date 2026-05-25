public class PivotIndex {
    public static int solution(int[] nums){
        for(int i=0;i<nums.length;i++){
            int sum1=0,sum2=0;
            for(int j=0;j<i;j++){
                sum1=sum1+nums[j];
            }
            for(int j=i+1;j<nums.length;j++){
                sum2=sum2+nums[j];
            }
            if(sum1==sum2){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int[] nums={1,7,3,6,5,6};
        System.out.print(solution(nums));
    }
}
