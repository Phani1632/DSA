package MaximumAreaOfIsland;

import java.util.LinkedList;
import java.util.Queue;
//not correct
public class Solution {
    record pair(int row, int col) {
    }

    public static int maxAreaOfIsland(int[][] grid) {
        int result = 0;
        Queue<pair> queue = new LinkedList<>();
        while (!queue.isEmpty()) {
            int row = queue.peek().row;
            int col = queue.peek().col;
        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if (grid[i][j] != 0) {
                    if (i > 0 && grid[i - 1][j] != 0) {
                        queue.add(new pair(i-1,j));
                    }
                    if (j > 0 && grid[i][j - 1] != 0) {
                        queue.add(new pair(i, j-1));
                    } 
                    if(j < grid[0].length-1 && grid[i][j + 1] != 0)  {
                        queue.add(new pair(i, j+1));
                    }
                    if(i<grid.length && grid[i+1][j]!=0){
                        queue.add(new pair(i+1, j));
                    }
                }
            }
        }

        return 0;

    }

    public static void main(String[] args) {
        int[][] grid = { { 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0 },
                { 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0 },
                { 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0 } };

        System.out.println(maxAreaOfIsland(grid));
    }
}
