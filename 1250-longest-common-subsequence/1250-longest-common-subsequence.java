class Solution {
    
    public int longestCommonSubsequence(String text1, String text2) {
        int size1 = text1.length();
        int size2 = text2.length();

        int[][] dp = new int[size1+1][size2+1];
        for(int i=0; i<=size1; i++){
            for(int j=0; j<=size2; j++){
                dp[i][j] = -1;
            }
        }

        return findLongestCommonSubsequence(text1, text2, size1, size2, dp);
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