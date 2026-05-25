import java.lang.StackWalker.Option;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Optional;

public class MergingIntervals {
    public void solution(int[][] nums){
        Arrays.sort(nums);
        // HashMap<Integer,String> map = new HashMap<>();
        // for(int i=0;i<nums.length;i++){
        //     for(int j=nums[i][0];j<nums[i][1];j++){
        //         map.put(i,"Y");
        //     }
        // }
        // for(int key:map.keySet()){
        //     Optional<Integer> min = map.keySet().stream().findFirst();
        //     if(map.getOrDefault(key, "N") == "Y"){
        //         int max= key;
        //     }
        // }
    }
    public static void main(String[] args) {
        // int[][] nums= {{1,2},{1,9},{1,3},{2,5}};
        int[] nums= {9,8,7,6,5,4,3,2,1};
        Arrays.sort(nums);
        for(int i: nums){
            System.out.println(i);
        }
        System.out.println(nums.toString());
    }
}
