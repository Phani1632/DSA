package WordBreak;

import java.util.Arrays;
import java.util.List;

public class OpSolution {
    public static boolean wordBreak(String s, List<String> wordDict) {
        int[][] dp = new int[s.length() + 1][s.length() + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = i+1; j < dp.length; j++) {
                for(String word:wordDict){
                    if(s.substring(i, j).equals(word)){                        
                        dp[i][j]=1;
                        if(dp[0][i]==1){
                            dp[0][j]=1;
                        }
                    }
                }
            }
        }
        if(dp[0][s.length()]==1){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
         String[] list = { "car","ca","rs"};
        List<String> wordDict = Arrays.asList(list);
        String s = "cars";
        System.out.println(wordBreak(s, wordDict));
    }
}
