class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> pos = new ArrayList<Integer>();
        ArrayList<Integer> neg = new ArrayList<Integer>();

        for(int num: nums){
            if (num < 0) neg.add(num);
            else pos.add(num);
        }

        for(int i=0; i<nums.length; i++){
            if(i%2 == 0){
                nums[i] = pos.get(0);
                pos.remove(0);
            }
            else{
                nums[i] = neg.get(0);
                neg.remove(0);
            }
        }

        return nums;
    }
}