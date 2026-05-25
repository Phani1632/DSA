package ValidAnagram;

import java.util.Arrays;

public class Solution {
    public static boolean checkAnagram(String s, String f){
        char[] s1 =s.toCharArray();
        char[] s2 =s.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        if(Arrays.equals(s1,s2)){
            return true;
        }
        else{
            return false;
        }        
    }
    public static void main(String[] args){
        System.out.println(checkAnagram("car", "rat"));
    }
}
