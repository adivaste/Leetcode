class Solution {
    public int countOrders(int n) {
       long[] dp = new long[501];
       int mod = (int)Math.pow(10, 9)+7;
       dp[1]=1;
       dp[2]=6;
       for(int i = 3; i <= n; i++){
           int oddNum = 2*i -1;
           dp[i]=dp[i-1]*(oddNum*(oddNum+1)/2)%mod;
       } 
       return (int)dp[n];
    }
}