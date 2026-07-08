package RottingTomatos;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public static int orangesRotting(int[][] grid) {
        int fresh = 0;
        int minutes = 0;

        Queue<int[]> qu = new LinkedList<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2) {
                    qu.offer(new int[] { i, j });
                } else if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }
        if (fresh == 0)
            return 0;
        int[][] dr = {
                { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 }
        };
        while (!qu.isEmpty()) {
            for (int i = 0; i < qu.size(); i++) {
                int[] arr = qu.poll();
                for (int[] d : dr) {
                    int r = arr[0] + d[0];
                    int c = arr[1] + d[1];

                    if (r < 0 || c < 0 || r >=grid.length || c >= grid[0].length){
                        continue;
                    }   

                    if (grid[r][c] != 1) {
                        continue;
                    }
                    grid[r][c] = 2;
                    qu.offer(new int[] { r, c });
                    fresh--;
                }
            }
            minutes++;
        }
       
        return (fresh==0)? minutes-1:-1;
    }

    public static void main(String[] args) {
        int[][] grid = { { 2, 1, 1 }, { 1, 1, 0 }, { 0, 1, 1 } };
        System.out.println(orangesRotting(grid));
    }
}
