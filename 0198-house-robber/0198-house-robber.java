class Solution {
    public int rob(int[] nums) {
        int size =  nums.length;
        int[] dp = new int[size+1];

        for(int i=0; i<=size; i++) dp[i] = -1;
        return rob(nums, nums.length-1, dp);
    }

    public int rob(int[] nums, int curr, int[] dp){
        if (curr < 0) return 0;
        if (dp[curr] != -1) return dp[curr];

        int robbed  = nums[curr] + rob(nums, curr - 2, dp);
        int skipped = rob(nums, curr - 1, dp);
        dp[curr] = Math.max(robbed, skipped);

        return dp[curr];
    }
}

/*

nums = [1,2,3,1]
                        0  ==> 1
                        2  ==> 3
                        4  ==> 0

                        total = 4

                        1 ==> 2
                        3 ==> 1
                        5 ==> 0

                        total = 3
*/