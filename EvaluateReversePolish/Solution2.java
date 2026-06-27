package EvaluateReversePolish;

import java.util.Stack;

public class Solution2 {
    public static int evalRPN(String[] tokens) {
        int num2 = 0;
        int num1 = 0;
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            try{
                st.push(Integer.parseInt(tokens[i]));
            }catch(Exception ex){
                num2 = st.pop();
                num1 = st.pop();
                switch (tokens[i]) {
                    case "+":
                        st.push(num1 + num2);
                        break;
                    case "-":
                        st.push(num1 - num2);
                        break;
                    case "*":
                        st.push(num1 * num2);
                        break;
                    case "/":
                        st.push(num1 / num2);
                        break;
                    default:
                        break;
                }
            }
        
        }
        return st.pop();
    }

    public static void main(String[] args) {
        String[] tokens = { "2", "1", "+", "3", "*" };
        System.out.println(evalRPN(tokens));
    }
}
