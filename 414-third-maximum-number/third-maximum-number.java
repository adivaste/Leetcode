class Solution {
    public int thirdMax(int[] nums) {
        int largest = nums[0];
        int sLargest = Integer.MIN_VALUE;
        int tLargest = Integer.MIN_VALUE;

        // A1 :: Sort Array
        Arrays.sort(nums);

        // Find largest
        largest = nums[nums.length-1];

        // Find second largest
        for(int i=nums.length-2; i>=0; i--){
            if (nums[i] < largest){
                sLargest = nums[i];
                for(int j=i-1; j>=0; j--){
                    if (nums[j] < sLargest){
                        tLargest = nums[j];
                        return tLargest;
                    }
                }
                break;
            }
        }

        return largest;
    }
}