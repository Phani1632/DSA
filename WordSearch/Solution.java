package WordSearch;

public class Solution {
    public static boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;
        boolean[][] visited = new boolean[rows][cols];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(word.charAt(0) == board[i][j]){
                    if(search(board, word, j, i, 0, visited)){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean search(char[][] board, String word, int x, int y, int wordPos, boolean[][] visited){
        if(wordPos == word.length() - 1){
            return true;
        }

        visited[y][x] = true;
        boolean found = false;

        if(x < board[0].length - 1 && !visited[y][x + 1] && board[y][x + 1] == word.charAt(wordPos + 1)){
            if(search(board, word, x + 1, y, wordPos + 1, visited)){
                found = true;
            }
        }
        if(!found && x > 0 && !visited[y][x - 1] && board[y][x - 1] == word.charAt(wordPos + 1)){
            if(search(board, word, x - 1, y, wordPos + 1, visited)){
                found = true;
            }
        }
        if(!found && y < board.length - 1 && !visited[y + 1][x] && board[y + 1][x] == word.charAt(wordPos + 1)){
            if(search(board, word, x, y + 1, wordPos + 1, visited)){
                found = true;
            }
        }
        if(!found && y > 0 && !visited[y - 1][x] && board[y - 1][x] == word.charAt(wordPos + 1)){
            if(search(board, word, x, y - 1, wordPos + 1, visited)){
                found = true;
            }
        }

        visited[y][x] = false;
        return found;
    } 
    public static void main(String[] args) {
        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "SEE";
        System.out.println(exist(board, word));
    }

}
