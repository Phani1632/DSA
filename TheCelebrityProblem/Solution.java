package TheCelebrityProblem;

import java.util.ArrayList;

public class Solution {
    public static int celebrity(int mat[][]) {
        ArrayList<Integer> list = new ArrayList<>();
        // code here
        for(int i =0;i<mat.length;i++){
            int flag=0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1 && i!=j){
                    flag++;
                    list.add(j);                    
                }
            }
            if(flag!=0){
                if(list.contains(i)){
                    list.remove(list.indexOf(i));
                }                
            }
        }
        for(int idx =0; idx<list.size();idx++){
            final int j = list.get(idx);
            for(int i=0;i<mat.length;i++){
                if(mat[i][j]!=1){
                    list.removeIf(a->a.equals(j));
                }
            }
        }
        return (list.isEmpty()) ? -1 : list.get(0);      
    }
    public static void main(String[] args) {
        int[][] mat = {{1, 1},{1, 1}};
        System.out.println(celebrity(mat));

    }
}
