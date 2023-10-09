class Solution {
    public int[] searchRange(int[] nums, int target) {
        return (new int[]{binarySearch(nums,target,true), binarySearch(nums,target,false)});
    }
    private static int binarySearch(int[] arr, int target, boolean lookingFirst){
        int start  = 0;
        int end = arr.length - 1;

        int idxToReturn = -1;

        while (start <= end){
            int mid = start + (end-start)/2;

            if (arr[mid] == target) {
                idxToReturn = mid;
                if (lookingFirst) end = mid - 1;
                else start = mid + 1;
            }
            else if(target < arr[mid]) end = mid - 1;
            else start = mid + 1;
        }

        return idxToReturn;
    }
}