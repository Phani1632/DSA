package WordBreak;

import java.util.Arrays;
import java.util.List;

public class Solution {
    public static boolean wordBreak(String s, List<String> wordDict) {
        int pos = 0;
        for (int i = 0; i < wordDict.size(); i++) {
            if (pos == s.length()) {
                return true;
            }
            // System.out.println(s.charAt(pos) + "-" + i + "th time");
            // System.out.println(wordDict.get(i).charAt(0) + "-" + i + "th time");
            if (s.charAt(pos) == wordDict.get(i).charAt(0)) {
                // System.out.println(s.substring(pos, pos + wordDict.get(i).length()));
                // System.out.println(wordDict.get(i));
                if (s.substring(pos, pos + wordDict.get(i).length()).equals(wordDict.get(i))) {
                    pos = pos + wordDict.get(i).length();
                    i = -1;
                }
            }
        }
        return false;
    }

    public static void main(String args[]) {
        String[] list = { "cats","dog","sand","and","cat"};
        List<String> wordDict = Arrays.asList(list);
        String s = "catsandog";
        System.out.println(wordBreak(s, wordDict));
        // System.out.println(s.substring(0,4));
    }
}
