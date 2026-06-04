package LongestHappyPrefix;

public class Solution {
    public static String longestPrefix(String s) {
        int left=0;
        int right =1;
        String res ="";
        while(right<s.length()){
            if(s.charAt(left)!=s.charAt(right)){
                right++;
            }
            else{
                if(s.substring(right, s.length()).equals(s.substring(0,s.length()-right))){
                    if(res.length()<s.length()-right){
                        res=s.substring(right, s.length());
                    }
                }
                right++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String s ="level";
        System.out.println(longestPrefix(s));
    }
}
