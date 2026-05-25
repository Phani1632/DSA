import java.util.HashMap;
import java.util.TreeSet;

public class UniqueSubstring {
    public static int countSubs(String s) {
        // code here
        TreeSet<String> set = new TreeSet<String>();
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                set.add(s.substring(i,j+1));
            }
        }
        System.out.println(set);
        return set.size();
    }
    public static HashMap<String,Integer> countUniqueString(String s){
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(map.containsKey(s.substring(i,j+1))){
                    int count= map.get(s.substring(i,j+1));
                    // System.out.println(s.substring(i,j+1));
                    // System.out.println(count);
                    map.replace(s.substring(i,j+1),count+1);
                }
                else{
                    map.put(s.substring(i,j+1),1);
                }
            }
        }
        return map;
    }
    public static void main(String[] args){
        String s ="abbabb";
        // System.out.println(countSubs(s));
        HashMap<String,Integer> map = countUniqueString(s);
        System.out.println(map);
    }
}
