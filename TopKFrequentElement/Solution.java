import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution {
    public static int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        LinkedHashMap<Integer, Integer> sorterdMap = map.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new));

        Object[] key = sorterdMap.keySet().toArray();

        for (int i = 0; i < k; i++) {
            res[i] = (Integer) key[i];
        }

        return res;

    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 2, 2, 3 };
        for(int num:topKFrequent(nums, 2)){
            System.out.println(num);
        }
    }
}
