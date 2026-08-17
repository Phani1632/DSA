import java.util.Arrays;

class Solution {
    public static int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];
        int prod = 1;
        int flag = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                prod = prod * nums[i];
            } else {
                flag++;
            }
        }
        if (flag > 1) {
            Arrays.fill(arr, 0);
            return arr;
        }
        for (int i = 0; i < nums.length; i++) {
            if (flag == 1) {
                if (nums[i] == 0) {
                    arr[i] = prod;
                } else {
                    arr[i] = 0;
                }
            } else {
                arr[i] = prod / nums[i];
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        int res[]=productExceptSelf(nums);
        Arrays.stream(res).forEach(System.out::print);
    }
}