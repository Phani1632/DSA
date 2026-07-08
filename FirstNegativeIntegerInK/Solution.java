package FirstNegativeIntegerInK;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Integer> firstNegInt(int arr[], int k) {
        List<Integer> list = new ArrayList<>();
        // code here
        for(int i=0;i<=arr.length-k;i++){
            int flag =0;
            for(int j=0;j<k;j++){
                if(arr[i+j]<0){
                    list.add(arr[i+j]);
                    flag=1;
                    break;
                }
            }
            if(flag !=1){
                list.add(0);
            }
        }
        return list;
    }
    public static void main(String[] args){
        int[] arr = {-8, 2, 3, -6, 10};
        firstNegInt(arr, 2).stream().forEach(System.out::print);
    }
}
