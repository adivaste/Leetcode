class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        
        int count = 0;
        int size =  nums.length;

        for(int i=0; i<size; i++){
            int j = i+1;
            int k = size-1;

            while(j<k){
                int fdiff = nums[j] - nums[i];
                int sdiff = nums[k] - nums[j];

                if ( fdiff == sdiff && fdiff == diff){
                    count++;
                    j++;
                    k--;
                }
                else if ( fdiff < diff){
                    j++;
                }
                else if (sdiff > diff){
                    k--;
                }
                else{
                    j++;
                    k--;
                }
            }
        }

        return count;
    }
}