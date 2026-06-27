package FloodFil;

public class Solution {
    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int oldColor = image[sr][sc];
        if(color == oldColor){
            return image;
        }
        bfs(image, sr, sc, color, oldColor);
        return image;
    }
    public static void bfs(int[][] image, int sr, int sc , int colour,int oldColor){
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || image[sr][sc] != oldColor) {
            return ;
        } 
        image[sr][sc]=colour;
        bfs(image, sr+1, sc, colour, oldColor);
        bfs(image, sr-1, sc, colour, oldColor);
        bfs(image, sr, sc+1, colour, oldColor);
        bfs(image, sr, sc-1, colour, oldColor);
    } 
    public static void main(String[] args) {
        int[][] image ={{0,0,0},{0,0,0}};
        int[][] result= floodFill(image,0,0,0);
        for(int i=0;i<result.length;i++){
            for(int j =0 ; j <result[0].length;j++){
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
    }

}
