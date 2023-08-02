class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        int closestSum = Integer.MAX_VALUE;
        int size = nums.length;
        Arrays.sort(nums);

        for(int i=0; i<size; i++){
            int j = i+1;
            int k = size-1;

            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if (Math.abs(closestSum - target) > Math.abs(sum - target) ){
                    closestSum = sum;
                }
                else if (sum < target){
                    j++;
                }
                else k--;
            }
        }
        return closestSum;
    }
}