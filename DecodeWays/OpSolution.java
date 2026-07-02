package DecodeWays;

public class OpSolution {
    public static int numDecodings(String s) {
        int[][] dp = new int[s.length()+1][s.length()+1];
        for(int i=0;i<dp.length;i++){
            for(int j=1;j<=2 && i+j<dp.length;j++){
                if(((Integer.parseInt(s.substring(i,i+j)))<=26) && s.charAt(i)!='0'){
                    dp[i][i+j]=1;
                    if(dp[0][i]>0){
                        dp[0][i+j]+=dp[0][i];
                    }
                }
            }
        }
        return dp[0][dp.length-1];
    }
    public static void main(String[] args) {
        String s="111111111111111111111111111111111111111111111";
        System.out.println(numDecodings(s));
       
        
    }
}
