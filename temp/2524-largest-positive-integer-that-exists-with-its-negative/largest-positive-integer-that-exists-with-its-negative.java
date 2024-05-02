class Solution {
    public int findMaxK(int[] nums) {
        
        // Sort the array
        Arrays.sort(nums);

        // Two pointers 
        int left = 0;
        int right = nums.length-1;

        while(left < right){
            if (nums[left] + nums[right] == 0){
                return nums[right];
            }
            else if (Math.abs(nums[left]) < Math.abs(nums[right])){
                right--;
            }
            else{
                left++;
            }
        }

        return -1;
    }
}