package LongestPalindrom;

public class Solution {

    public static String longestPalindrome(String s) {
        int left = 0;
        int right = 1;
        String result = "";
        if (s.length() == 1) {
            return s;
        }
        if (s.length() == 2) {
            if (!s.substring(0, 1).equals(s.substring(1, 2))) {
                System.out.println(s.substring(0, 1));
                System.out.println(s.substring(1, 2));
                return s.substring(0, 1);
            }
        }
        while (left < s.length() - 1) {
            if (s.charAt(left) == s.charAt(right)) {
                String reverse = new StringBuilder(
                        s.substring(((int) Math.ceil(((double) right + left) / 2)), right + 1)).reverse().toString();

                String part = s.substring(left, ((right + left) / 2) + 1);
                if ((part).equals(reverse)) {
                    if (result.length() < right - left + 1) {
                        result = s.substring(left, right + 1);
                    }
                }
                left++;
                right = left + 1;
            } else {
                if (right < s.length() - 1) {
                    right++;
                } else {
                    left++;
                    right = left + 1;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "bb";
        System.out.println(longestPalindrome(s));
    }
}
