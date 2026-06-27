package NumberOfIslands;

public class Solution {
    public static int numIslands(char[][] grid) {
        int count = 0;
        int[][] island = new int[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] != '0') {
                    if (i > 0 && island[i - 1][j] != 0) {
                        island[i][j] = island[i - 1][j];
                    } else if (j > 0 && island[i][j - 1] != 0) {
                        island[i][j] = island[i][j - 1];
                    } else {
                        count++;
                        island[i][j] = count;
                    }

                }
            }
        }
        for (int i = 0; i < island.length; i++) {
            for (int j = 0; j < island[0].length; j++) {
                System.out.print(island[i][j] + " ");
            }
            System.out.println();
        }

        return count;
    }

    public static void main(String[] args) {
        char[][] grid = {{'1','1','1'},{'0','1','0'},{'1','1','1'}};

        System.out.println(numIslands(grid));
    }

}
