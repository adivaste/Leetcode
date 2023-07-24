class Solution {

    public int search(int[] nums, int target) {
        return binarySearch(nums, target, 0, nums.length-1);
    }
    public int binarySearch(int[] nums, int target, int low, int high) {
        if (low > high) return -1;

        int mid = low + (high-low)/2;
        
        if(nums[mid] == target) return mid;
        else if (target < nums[mid]) return binarySearch(nums, target, low, --high);
        return binarySearch(nums, target, ++low, high);
    }
}