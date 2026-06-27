package ImplementationOfQueue;

import java.util.Iterator;
import java.util.Stack;

public class MyQueue {
    private Stack<Integer> st;
    public MyQueue() {
        Stack<Integer> st = new Stack<>();
        this.st =st;
    }
    
    public void push(int x) {
        Stack<Integer> st2 = new Stack<>();
        st2.push(x);
        Iterator<Integer> it = st.iterator();
        while(it.hasNext()){
            st2.push(it.next());
        }
        st=st2;
    }
    
    public int pop() {
        int result=0;
        Iterator<Integer> it = st.iterator();
        while(it.hasNext()){
           result =it.next();
        }
        it.remove();
        return result;
    }
    
    public int peek() {
        int result=0;
        Iterator<Integer> it = st.iterator();
        while(it.hasNext()){
           result =it.next();
        }
        return result;
    }
    
    public boolean empty() {
        return st.isEmpty();
    }
}
