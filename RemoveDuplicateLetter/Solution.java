package RemoveDuplicateLetter;

import java.util.Stack;

public class Solution {
    public static String removeDuplicateLetters(String s) {
        int[] index = new int[26];
        for (int i = 0; i < s.length(); i++) {
            index[s.charAt(i) - 'a'] = i;
        }
        Stack<Character> stack = new Stack<Character>();
        boolean[] visited = new boolean[26];
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (visited[current - 'a']) {
                continue;
            }
            while (!stack.isEmpty() && current < stack.peek() && index[stack.peek() - 'a'] > i) {
                visited[stack.pop() - 'a'] = false;
            }
            stack.push(current);
            visited[current-'a']=true;
        }
        StringBuilder sb = new StringBuilder();
        for (char c : stack) {
            sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "cbacdcbc";
        System.out.println(removeDuplicateLetters(s));
    }
}
