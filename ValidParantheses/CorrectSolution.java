package ValidParantheses;

import java.util.Stack;

public class CorrectSolution {
    public static boolean isValid(String s){
        Stack<Character> st = new Stack<Character>();
        for(int i=0;i<s.length();i++){
            if(!st.isEmpty()){
                switch(st.peek()){
                    case '{':
                        if(s.charAt(i)=='}'){
                            st.pop();
                        }
                        else if(s.charAt(i)=='{' || s.charAt(i)=='[' || s.charAt(i)=='('){
                            st.push(s.charAt(i));
                        }
                        else{
                            return false;
                        }
                        break;
                    case '[':
                        if(s.charAt(i)==']'){
                            st.pop();
                        }
                        else if(s.charAt(i)=='{' || s.charAt(i)=='[' || s.charAt(i)=='('){
                            st.push(s.charAt(i));
                        }
                        else{
                            return false;
                        }
                        break;
                    case '(':
                        if(s.charAt(i)==')'){
                            st.pop();
                        }
                        else if(s.charAt(i)=='{' || s.charAt(i)=='[' || s.charAt(i)=='('){
                            st.push(s.charAt(i));
                        }
                        else{
                            return false;
                        }
                        break;
                }
            }
            else{
                if(s.charAt(i)=='}' || s.charAt(i)==']' || s.charAt(i)==')')
                {
                    return false;
                }
                else{
                    st.push(s.charAt(i));
                }
            }
        }
        
        return st.isEmpty();
    }
    public static void main(String[] args) {
        String str = "()[]{}";
        System.out.print(isValid(str));
    }
}
