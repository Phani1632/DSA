package LRUCache;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class LRUCache {
    Queue<ArrayList<Integer>> queue;
    int capacity;
    public LRUCache(int capacity) {
        this.queue= new LinkedList<ArrayList<Integer>>();
        this.capacity = capacity;
    }
    
    public int get(int key) {
        Iterator<ArrayList<Integer>> it = this.queue.iterator();
        while(it.hasNext()){
            ArrayList<Integer> temp = it.next();
            if(temp.get(0)==key){
                return temp.get(1);
            }
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(this.queue.size()==this.capacity-1){
            this.queue.poll();
        }
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        arr1.add(key);
        arr1.add(value);        
        this.queue.add(arr1);
    }
}
