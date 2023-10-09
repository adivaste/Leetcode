class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int size1 = text1.length();
        int size2 = text2.length();
        int[][] dp = new int[size1+1][size2+1];
        for(int i=0; i<size1; i++){
            for(int j=0; j<size2; j++){
                dp[i][j] = -1;
            }
        }

        return getLongestCommonSubsequence(text1, text2, size1, size2, dp);
    }

    public int getLongestCommonSubsequence(String text1, String text2, int size1, int size2, int[][] dp){

        if (size1 == 0 || size2 == 0){
            return 0;
        }
        else if (dp[size1-1][size2-1] != -1){
            return dp[size1-1][size2-1];
        }
        else if (text1.charAt(size1-1) == text2.charAt(size2-1)){
            dp[size1-1][size2-1] = 1 + getLongestCommonSubsequence(text1, text2, size1-1, size2-1, dp);
            return dp[size1-1][size2-1];
        }
        else{
            dp[size1-1][size2-1] = Math.max(getLongestCommonSubsequence(text1, text2, size1-1, size2, dp), getLongestCommonSubsequence(text1, text2, size1, size2-1, dp));
            return dp[size1-1][size2-1];
        }

    }
}