class Solution {
    public int removeDuplicates(int[] nums) {
        int size = nums.length;
        if (size == 1) return 1;

        int left = 0;
        int right = 1;
        while(right < size){
            if (nums[left] != nums[right]){
                left++;
                nums[left] = nums[right];
            }
            right++;
        }

        return left+1;
    }
}