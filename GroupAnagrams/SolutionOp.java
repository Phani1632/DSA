package GroupAnagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolutionOp {

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<List<String>>();
        int[] check = new int[strs.length];
        for (int i = 0; i < strs.length; i++) {
            List<String> list = new ArrayList<>();
            char[] c1 = strs[i].toCharArray();
            Arrays.sort(c1);
            for (int j = i; j < strs.length; j++) {
                if (check[j] != 1 && strs[i].length()==strs[j].length()) {
                    char[] c2 = strs[j].toCharArray();
                    Arrays.sort(c2);
                    if (Arrays.equals(c1, c2)) {
                        list.add(strs[j]);
                        check[j] = 1;
                    }
                }
            }
            if(!list.isEmpty()) result.add(list);
        }
        return result;
    }

    public static void main(String[] args) {
        String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
        System.out.println(groupAnagrams(strs));

    }
}
