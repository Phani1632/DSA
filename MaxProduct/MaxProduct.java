public class MaxProduct {
    public static int solution(int[] nums){
        int highest=nums[0];
        int product,i,j;
        for( i=0;i<nums.length;i++){
            product =1;
            for(j=i;j<nums.length;j++){
                product=product*nums[j];
                highest=Math.max(highest,product);
            }
            
        }
        return highest;
    }
    public static void main(String args[]){
       int[] nums ={1,2,3,4,-1};
       System.out.println(solution(nums));
    }
}
