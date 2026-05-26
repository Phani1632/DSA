package ReverseWords;

public class Solution {
    public static String reverseWords(String s) {
        String[] res = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = res.length - 1; i >= 0; i--) {
            if (res[i] != "") {
                sb.append(res[i]);
                sb.append(" ");
            }
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String str = "a good   example";
        System.out.println(reverseWords(str));
    }
}
