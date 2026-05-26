package RunLengthEncoding;

public class Solution {
    public static int compress(char[] chars) {
        int left = 0;
        int right = 1;
        int count = 1;
        int position =-1;

        if(chars.length ==1){
            return 1;
        }
        while (left < right) {
            char value=chars[left];
            if(right == chars.length ){
                chars[++position]=value;
                if(count!=1){
                    char[] c = String.valueOf(count).toCharArray();
                    for(int i=0;i<c.length;i++){
                        chars[++position]=c[i];
                    }                    
                }
                break;
            }
            if (chars[right] == chars[left]) {
                count++;
                right++;
            } 
            else {
                chars[++position]=value;
                if(count!=1){
                    char[] c = String.valueOf(count).toCharArray();
                    for(int i=0;i<c.length;i++){
                        chars[++position]=c[i];
                    }  
                }
                left = right;
                right++;
                count = 1;
            }
        }
        return position+1;
    }

    public static void main(String[] args) {
        char[] c = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        int n=compress(c);
        for(int i=0;i<n;i++){
            System.out.print(c[i]);
        }
    }
}
