class Solution {
    
    public int solve(int[] dp, int n){
        if(n<=1) return n;
        if(dp[n] != -1) return dp[n];
        dp[n] = solve(dp, n-1) + solve(dp, n-2);
        return dp[n];
    }
    public int fib(int n) {
        if (n<=1) return n;        
        int[] dp = new int[n+1];
        for(int i=0; i<n+1; i++) {
            dp[i] = -1;
        }
        return solve(dp, n);
    }
}