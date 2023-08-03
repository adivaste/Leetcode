class Solution {
    public int maximizeSum(int[] nums, int k) {
        // Brutforce
        int max = nums[0];
        int score = 0;

        for(int num : nums){
            max = Math.max(max, num);
        }

        for(int i=max; i<max+k; i++){
            score += i;
        }

        return score;       
    }
}