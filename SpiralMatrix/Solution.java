package SpiralMatrix;

import java.util.ArrayList;
// import java.util.Arrays;
import java.util.List;

public class Solution {
    public static List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        int endRows = matrix.length-1;
        int startRow =0;
        int startColumn=0;
        int endColumn = matrix[0].length-1;
        int i=0;
        int j=0;
        String flag = "right";
        // if(startColumn==endColumn){
        //     for(int p=0;p<matrix[0].length;p++){
        //         list.add(matrix[0][p]);
        //     }
        //     return list;
        // }
        while(matrix[i][j]!= 101){
            if(startColumn==endColumn && startRow == endRows){
                list.add(matrix[i][j]);
                return list;
            }
            if(j==endColumn){
                if(i==startRow){
                    if(flag!="down"){
                        startRow++;
                    }
                    flag="down";                    
                }
            }
            if(i==endRows){
                if(j==endColumn){
                    if(flag!="left"){
                        endColumn--;
                    }
                    flag="left";
                    
                }
            }
            if(j==startColumn){
                if(i==endRows){
                    if(flag!="up"){
                        endRows--;
                    }
                    flag="up";
                    
                }
            }
            if(i==startRow){
                if(j==startColumn){
                    if(flag!="right"){
                        startColumn++;
                    }
                    flag="right";
                    
                }
            }
            switch (flag) {
                case "right":
                    list.add(matrix[i][j]);
                    matrix[i][j]=101;
                    j++;
                    break;
                case "left":
                    list.add(matrix[i][j]);
                    matrix[i][j]=101;
                    j--;
                    break;
                case "up":
                    list.add(matrix[i][j]);
                    matrix[i][j]=101;
                    i--;
                    break;
                case "down":
                    list.add(matrix[i][j]);
                    matrix[i][j]=101;
                    i++;
                    break;            
                default:
                    break;
            }

        }
        return list;
    }
    public static void main(String[] args) {
        int[][] res= {{7},{9},{6}};
        List<Integer> list= spiralOrder(res);
        System.out.println(list);
        
    }
}
