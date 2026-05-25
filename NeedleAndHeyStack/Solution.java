package NeedleAndHeyStack;

public class Solution {
    public static int strStr(String haystack, String needle) {        
        for(int i=0;i<=haystack.length()-needle.length();i++){
            System.out.println(haystack.substring(i,needle.length()+i));
            if(haystack.substring(i,needle.length()+i).equals(needle)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(strStr("sadbutsad", "sad"));
    }
}
