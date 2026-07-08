import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class OpSolution {
    public static int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));

        for (int key : map.keySet()) {
            queue.offer(key);
            if (queue.size() > k) {
                queue.poll();
            }
        }
        for (int i = k-1; i >= 0; i--) {
            res[i] = queue.poll();
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 2, 2, 3 };
        for (int num : topKFrequent(nums, 2)) {
            System.out.println(num);
        }
    }
}
