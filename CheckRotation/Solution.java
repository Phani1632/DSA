package CheckRotation;

public class Solution {
    public static boolean rotateString(String s, String goal) {
        for(int i=0;i<s.length();i++){
            if(goal.charAt(0)==s.charAt(i)){
                if((s.substring(i, s.length())+s.substring(0, i)).equals(goal)){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String s = "abcde";
        String goal = "abced";
        System.out.println(rotateString(s,goal));
    }
}
