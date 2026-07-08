package CombinationSum;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution2 {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<List<Integer>>> list = new ArrayList<>();
        // List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i <= target; i++) {
            list.add(new ArrayList());
        }
        list.get(0).add(new ArrayList<>());

        for (int i = 1; i <= target; i++) {
            for (int nums : candidates) {
                if (nums <= i && !list.get(i - nums).isEmpty()) {
                    for (List<Integer> li : list.get(i - nums)) {
                        ArrayList<Integer> temp = new ArrayList<>();
                        for (int a : li) {
                            temp.add(a);
                        }

                        temp.add(nums);
                        Collections.sort(temp);
                        if(!list.get(i).contains(temp))
                            list.get(i).add(temp);
                    }
                }
            }
        }
        // for(List<Integer> li : list.get(target)){
        //     Collections.sort(li);
        //     if(!result.contains(li)){
        //         result.add(li);
        //     }

        // }
        return list.get(target);
    }

    public static void main(String[] args) {
        int[] candidates = { 2, 3, 6, 7 };

        for (List<Integer> num : combinationSum(candidates, 7)) {
            num.stream().forEach(System.out::print);
        }

    }
}
