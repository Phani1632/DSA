package CombinationSum;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static ArrayList<ArrayList<Integer>> combinationSum(int[] candidates, int target) {
       ArrayList<ArrayList<ArrayList<Integer>>> list = new ArrayList<ArrayList<ArrayList<Integer>>>();
       for(int i=0;i<=target;i++){
        list.add(new ArrayList<ArrayList<Integer>>());
       }
       list.get(0).add(new ArrayList<>(List.of(0)));
       
        for(int num:candidates){
            for(int i=1;i<=target;i++){
                if(i>=num && !list.get(i-num).isEmpty()){
                    for(ArrayList<Integer> li:list.get(i-num)){
                        li.add(candidates[i-num]);
                        list.get(i).add(li);
                    }
                }
            }
        }
        return list.get(target);
    }

    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};

        for(List<Integer> num: combinationSum(candidates, 7)){
            num.stream().forEach(System.out::print);
        }

    }
}
