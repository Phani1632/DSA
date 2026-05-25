package LongestSubstring;

public class Solution {
    public static int lengthOfLongestSubString(String s) {
        int[] hash = new int[256];
        int result=0;
        for (int i = 0; i < s.length(); i++) {
            int length =0;
            for (int j = i; j < s.length(); j++) {
                    if(hash[s.charAt(j)]==1){
                        break;
                    }
                    length=j-i+1;
                    result = Math.max(result, length);
                    hash[s.charAt(j)]=1;
            }
            
        }
        return result;
    }

    public static void main(String args[]) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubString(s));
    }
}
