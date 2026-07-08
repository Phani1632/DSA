package SortCharacterByFreq;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Solution {
    public static String frequencySort(String s) {
        StringBuilder sb = new StringBuilder();
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }

        PriorityQueue<Character> queue = new PriorityQueue<>(
            (a,b)-> map.get(a)-map.get(b)
        );
        for(char key: map.keySet()){
            queue.offer(key);
        }
        while(!queue.isEmpty()){
            char a =queue.poll();
            for(int i=0;i<map.get(a);i++){
                sb.append(a);
            }
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(frequencySort("tree"));
    }
}
