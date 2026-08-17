
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int findLuckyInteger(int[] arr){
        Map<Integer,Integer> map = new HashMap<>();
        int result = -1; 
        for(int i =0 ;i <arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
        }
        for(int i : map.keySet()){
            if(map.get(i)==i){
                result = Math.max(i, result);
            }
        }
        return result;
    }
    public static void main(String[] args){
        int[] arr = {2,2,3,4};
        System.out.println(findLuckyInteger(arr));
    }

}
