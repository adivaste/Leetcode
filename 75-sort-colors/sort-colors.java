class Solution {
    public void sortColors(int[] nums) {
        int zeros = 0;
        int ones = 0;
        int twos = 0;

        for(int i=0; i<nums.length; i++){
            if (nums[i] == 0 ) zeros++;
            else if (nums[i] == 1) ones++;
            else twos++;
        }

        int counter = 0;       
        for(int i=0; i<counter+zeros; i++){
            nums[i] = 0;
        }

        counter += zeros;
        for(int i=counter; i<counter+ones; i++){
            nums[i] = 1;
        }

        counter += ones;
        for(int i=counter; i<counter+twos; i++){
            nums[i] = 2;
        }
    }
}