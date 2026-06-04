package IsomorphicString;

import java.util.HashMap;
import java.util.TreeSet;

public class Solution {
    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map = new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        for(int i =0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                if(t.charAt(i)==map.get(s.charAt(i))){
                    continue;
                }
                else{
                    return false;
                }
            }
            else{
                if(map.containsValue(t.charAt(i))){
                    return false;
                }
                else{
                    map.put(s.charAt(i), t.charAt(i));
                }                
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s= "abbyo";
        String t ="ceecg";
        System.out.println(isIsomorphic(s, t));
    }
}
