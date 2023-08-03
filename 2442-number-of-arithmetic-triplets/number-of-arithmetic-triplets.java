class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        
        int count = 0;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                for(int k=j+1; k<nums.length; k++){
                    int fdiff = nums[j] - nums[i];
                    int sdiff = nums[k] - nums[j];

                    if (fdiff == sdiff && fdiff == diff){
                        count++;
                    }
                }
            }
        }

        return count;
    }
}