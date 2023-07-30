
class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int element = nums[0];

        for(int i=0; i<nums.length; i++){
            if (count == 0){
                count = 1;
                element = nums[i];
            }
            else if (nums[i] == element){
                count++;
            }
            else{
                count--;
            }
        }

        int counter = 0;
        for(int num : nums){
            if (num == element) counter++;
        }
        return counter > nums.length/2 ? element : -1;
    }
}
