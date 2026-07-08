package MinimumCostToCutStick;

import java.util.Arrays;

public class Solution {
    public int minCost(int n, int[] cuts) {
        int m = cuts.length;
        int[] arrays = new int[m+2];
        arrays[0]=0;
        arrays[m+1  ]=n;
        for(int i =0;i<m;i++){
            arrays[i+1]=cuts[i];
        }

        Arrays.sort(arrays);
        int len = m+2;
        int[][] dp = new int[len][len];

        for(int interval=2;interval<len;interval++){
            for(int i=0;i+interval<len;i++){
                int j=i+interval;
                dp[i][j]=Integer.MAX_VALUE;
                for(int k=i+1;k<j;k++){
                    dp[i][j] = Math.min(dp[i][j],dp[i][k]+dp[k][j]+arrays[j]-arrays[i]);
                }
                if(dp[i][j]==Integer.MAX_VALUE)
                    dp[i][j]=0;

            }
        }
        return dp[0][len-1];

    }
    public static void main(String[] args) {
        
    }
}
