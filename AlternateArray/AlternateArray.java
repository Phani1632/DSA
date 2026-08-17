import java.util.HashMap;
// import java.util.Iterator;
import java.util.Map;

public class AlternateArray {
    public static int minimumOperations(int[] nums) {
        // int even = 0;
        // int odd = 0;
        HashMap<Integer, Integer> evenMap = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> oddMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            // int count = 0;
            if (i % 2 == 0) {
                evenMap.put(nums[i], evenMap.getOrDefault(nums[i], 0) + 1);
                // even = Math.max(even, count);
            } else {
                // count = oddMap.getOrDefault(nums[i], 0) + 1;
                oddMap.put(nums[i], oddMap.getOrDefault(nums[i], 0) + 1);
                // odd = Math.max(odd, count);
            }
        }
        int[] o1 = getTopTow(evenMap);
        int[] o2 = getTopTow(oddMap);
        if (o1[0] != o2[0]) {
            return nums.length - o1[1] - o2[1];
        }
        return Math.min(
                nums.length - o1[1] - o2[3],
                nums.length - o1[3] - o2[1]);
    }

    public static int[] getTopTow(HashMap<Integer, Integer> map) {
        int firstValue = -1, firstCount = 0;
        int secondValue = -1, secondCount = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int val = entry.getKey();
            int count = entry.getValue();
            if (count >= firstCount) {
                secondValue = firstValue;
                secondCount = firstCount;

                firstCount = count;
                firstValue = val;
            } else if (count >= secondCount) {
                secondCount = count;
                secondValue = val;
            }
        }
        return new int[] {
                firstValue, firstCount, secondValue, secondCount };
    }

    public static void main(String args[]) {
        int[] nums = { 1, 2, 2, 2, 2 };
        System.out.println(minimumOperations(nums));

    }
}
