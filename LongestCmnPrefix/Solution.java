package LongestCmnPrefix;

public class Solution {
    public static String longestCommonPrefix(String[] strs) {
       
        return check(strs[0],strs,1);
    }
    public static String check(String str,String[] strs,int i){
        if(i == strs.length){
            return str;
        }
        String first = str;
        String second = strs[i];
        int j=0;
        while(j<first.length() && j<second.length()){
            if(first.charAt(j)==second.charAt(j)){
                j++;
            }
        }
        return check(first.substring(1, j),strs,i++);
    }
    public static void main(String[] args){
        String[] strs={"flower","flow","flight"};
        try{
        System.out.println(longestCommonPrefix(strs));
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
