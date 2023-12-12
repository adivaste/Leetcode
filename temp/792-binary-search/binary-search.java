class Solution {
    public int search(int[] nums, int target) {
        return find(nums, target, 0, nums.length-1);
    }

    public int find(int[] nums, int target, int start, int end){
        
        if (start > end) return -1;

        // Find the mid 
        int mid = start + (end - start)/2;
        if (nums[mid] == target) return mid;
        else if (nums[mid] < target) return find(nums, target, mid+1, end);
        else  return find(nums, target, start, mid-1);
    }
}