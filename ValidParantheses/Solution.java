package ValidParantheses;

public class Solution {
     public static boolean isValid(String s) {
        int a=0;
        int b=0;
        int c=0;
        for(int i=0;i<s.length();i++){
            if(a<=0 && s.charAt(i)==')'){
                return false;
            }
            if(b<=0 && s.charAt(i)==']'){
                return false;
            }
            if(c<=0 && s.charAt(i)=='}'){
                return false;
            }
            switch (s.charAt(i)) {
                case '(':
                    a++;
                    break;
                case '[':
                    b++;
                    break;
                case '{':
                    c++;
                    break;
                case ')':
                    a--;
                    break;
                case ']':
                    b--;
                    break;
                case '}':
                    c--;
                    break;
                default:
                    break;
            }
            System.out.println("For iteration number "+i+ " a = "+ a+" b = "+b+" c = "+c);

        }
        if(a==0 && b==0 && c==0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String str= "([)]";
        System.out.print(isValid(str));
    }
}
