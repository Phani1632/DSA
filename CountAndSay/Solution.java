package CountAndSay;

public class Solution {
    public static String countAndSay(int n) {
        if(n==1){
            return "1";
        }
        return RLE("1",n-2);
    }
    public static String RLE(String s,int n){
        StringBuilder sb = new StringBuilder();
        int i=0;
        while(i<s.length()){
            for(int j=i;j<=s.length();j++){
                if(s.length()==1){
                    i++;
                    sb.append("11");                    
                    break;
                }
                if(j==s.length()){
                    sb.append(j-i);                    
                    sb.append(s.charAt(i));
                    i=j;
                    break;
                }
                if(s.charAt(i)==s.charAt(j)){
                    continue;
                }
                else{
                    sb.append(j-i);                    
                    sb.append(s.charAt(i));
                    i=j;
                }
            }
        }
        if(n<=0){            
            return sb.toString();
        }
        return RLE(sb.toString(),n-1) ;
        
    }
    public static void main(String[] args) {
        System.out.println(countAndSay(2));
    }
}
