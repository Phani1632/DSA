public class MaxProductOp {
    public static int solution(int[] nums){
       int a=0;
        int product=1;
        int product2=1;
        int highest;
        if (nums.length==1){
            return nums[0];
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=0){
                a++;
            }
        }
        if(a%2==0){
            for(int i=0;i<nums.length;i++){
                product=product*nums[i];
            }
            highest=product;
        }
        else{
            int i;
            product=1;
            for(i=1;i<nums.length;i++){
                if(nums[i]>0){
                    product=product*nums[i];
                }
                else{
                    break;
                }                
            }
            product2=1;
            for(int j=i+1;j<nums.length;j++){
                product2=product2*nums[j];
            }
            highest=Math.max(product,product2);
            product=1;
            for(i=nums.length-1;i>=0;i--){
                if(nums[i]>0){
                    product=product*nums[i];
                }
                else{
                    break;
                }  
            }
            product2=1;
            for(int j=i-1;j>=0;j--){
                product2=product2*nums[j];
            }
            product=Math.max(product, product2);
            highest=Math.max(highest, product);

        }
        return highest;
    }
    public static void main(String args[]){
       int[] nums ={2,0};
       System.out.println(solution(nums));
    }
}
