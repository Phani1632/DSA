import java.util.ArrayList;
import java.util.List;

public class Sum {
    public static List<List<Integer>> solution(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {

                    if (nums[i] + nums[j] + nums[k] == 0) {
                        ArrayList<Integer> a = new ArrayList<>();
                        a.add(nums[i]);
                        a.add(nums[j]);
                        a.add(nums[k]);
                        list.add(a);
                    }

                }
            }

        }
        return list;
    }

    public static void main(String args[]) {
        int[] nums = { 1, 2, 3, 4, 1, 0, -1 };
        for (List<Integer> i : solution(nums)) {
            System.out.println(i);
        }
    }
}
