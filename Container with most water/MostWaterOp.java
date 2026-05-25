public class MostWaterOp {
    //2 pointer approch
    public static int solution(int[] height){
        int leftPointer = 0;
        int rightPointer = height.length -1;
        int result=0;
        while(leftPointer< rightPointer){
            result= Math.max(Math.min(height[leftPointer], height[rightPointer])*(rightPointer-leftPointer), result);
            if(height[leftPointer]==Math.min(height[leftPointer], height[rightPointer])){
                leftPointer++;
            }
            else{
                rightPointer--;
            }
        }
          
        return result;
    }
    public static void main(String[] args) {
        int [] height = {8,7,2,1};
        System.out.println(solution(height));
    }
}
