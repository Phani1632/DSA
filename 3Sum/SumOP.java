import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class SumOP {
    public static List<List<Integer>> solution(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.get(nums[i]) - 1);
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            for (int j = i; j < nums.length; j++) {
                map.put(nums[j], map.get(nums[j]) - 1);
                if (j > i + 1 && nums[j] == nums[j - 1])
                    continue;

                int target = -1 * (nums[i] + nums[j]);
                if (map.getOrDefault(target, 0) > 0) {
                    list.add(Arrays.asList(nums[i], nums[j], target));
                }
            }
            for (int j = i + 1; j < nums.length; j++) {
                map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 0, -1, 2, 0, -2 };
        for (List<Integer> i : solution(nums)) {
            System.out.println(i);
        }
    }
}
