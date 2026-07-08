package ImplementationOfStack;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class MyStack {

    Queue<Integer> queue;

    public MyStack() {
        Queue<Integer> queue = new LinkedList<>();
        this.queue=queue;
    }
    
    public void push(int x) {
        Queue<Integer> queue1 = new LinkedList<>();
        queue1.add(x);
        Iterator<Integer> it = this.queue.iterator();
        while (it.hasNext()) {
            queue1.add(it.next());
        }
        this.queue=queue1;
    }
    
    public int pop() {
       return queue.remove();
    }
    
    public int top() {
        Iterator<Integer> it = this.queue.iterator();
        return it.next();
    }
    
    public boolean empty() {
        return queue.isEmpty();
    }
}
