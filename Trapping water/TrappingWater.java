public class TrappingWater {
    public static int solution(int[] height) {
        int[] prefix=new int[height.length];
        int[] suffix = new int[height.length];
        int res=0;
        for(int i=0;i<height.length;i++){
            if(i==0){
                prefix[i]=height[i];
                suffix[height.length-1-i]=height[height.length-1-i];
            }
            else{
                prefix[i]=Math.max(prefix[i-1],height[i]);
                suffix[height.length-1-i]=Math.max(suffix[height.length-i],height[height.length-1-i]);
            }
        }
        // for(int i=height.length-1;i>=0;i--){
        //     if(i==height.length-1){
        //         suffix[i]= height[i];
        //     }
        //     else{
        //         suffix[i]=Math.max(suffix[i+1],height[i]);
        //     }
        // }
        for(int i=0;i<height.length;i++){
            if(height[i]<Math.min(prefix[i], suffix[i])){
                res=res+(Math.min(prefix[i], suffix[i])-height[i]);
            }
        }
        return res;
    }

    public static void main(String args[]) {
        int[] nums = { 4, 2, 3 };
        System.out.println(solution(nums));
    }
}
