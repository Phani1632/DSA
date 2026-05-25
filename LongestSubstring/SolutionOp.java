package LongestSubstring;

import java.util.HashMap;

public class SolutionOp {
    public static int lengthOfLongestSubString(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        int left=0;
        int right =0;
        int result =0;

        while (left<=right && right < s.length()){
            if(map.containsKey(s.charAt(right))){
                left=Math.max(left,map.get(s.charAt(right))+1);
            }
            result = Math.max(result,right-left+1);
            map.put(s.charAt(right), right);
            right++;
        }
        return result;
    }
    public static void main(String args[]) {
        String s = "abba";
        System.out.println(lengthOfLongestSubString(s));
    }
}
