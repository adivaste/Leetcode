class Solution {
    
    public int longestCommonSubsequence(String text1, String text2) {
        int size1 = text1.length();
        int size2 = text2.length();

        int[][] dp = new int[size1+1][size2+1];
        for(int i=0; i<=size1; i++){
            for(int j=0; j<=size2; j++){
                dp[i][j] = -1;
                if (i == 0 || j == 0) dp[i][j] = 0;
            }
        }

        for(int i=1; i<=size1; i++){
            for(int j=1; j<=size2; j++){
                if (text1.charAt(i-1) == text2.charAt(j-1)) dp[i][j] = 1 + dp[i-1][j-1];
                else dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
            }
        }

        return dp[size1][size2];
    }

    public int findLongestCommonSubsequence(String text1, String text2, int len1, int len2,int[][] dp){
        if (len1 == 0 || len2 == 0) return 0;

        if (dp[len1][len2] != -1) return dp[len1][len2];
        if (text1.charAt(len1-1) == text2.charAt(len2-1)){
            dp[len1][len2] = 1 + findLongestCommonSubsequence(text1, text2, len1-1, len2-1, dp);
        }
        else{
            dp[len1][len2] = Math.max(findLongestCommonSubsequence(text1, text2, len1, len2-1, dp),
            findLongestCommonSubsequence(text1, text2, len1-1, len2, dp));
        }

        return dp[len1][len2];
    }
}