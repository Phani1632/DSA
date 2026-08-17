package LongestCmnPrefix;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        int i=2;
        String first=strs[0];
        String second=strs[1];
       while(i<strs.length && first != ""){
            first=check(first, second);
            second=strs[i];
            i++;
       }
       return first;
    }
    public static String check(String first,String second){
        int i=0;
        while(first.length()<i && second.length()<i && first.charAt(i)==second.charAt(i)){
            i++;
        }
        return first.substring(0,i);
    }
    public static void main(String[] args){
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
    
}
