class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        int closestSum = Integer.MAX_VALUE;
        int size = nums.length;

        for(int i=0; i<size-2; i++){
            for(int j=i+1; j<size; j++){
                for(int k=j+1; k<size; k++){
                    int sum = nums[i] + nums[j] + nums[k];
                    if (Math.abs(target - closestSum) > Math.abs(target - sum)){
                        closestSum = sum;
                    }
                }
            }
        }

        return closestSum;

    }
}