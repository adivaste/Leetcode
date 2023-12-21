class Solution {
    
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Set<List<Integer>> set = new HashSet<List<Integer>>();

        findPermute(nums, result, 0, set);

        return result;
    }

    public void findPermute(int[] nums, List<List<Integer>> result, int curr, Set<List<Integer>> set){
        
        if(curr == nums.length){
            List<Integer> temp = new ArrayList<>();
            for (int num : nums) temp.add(num);
            if (!set.contains(temp)){
                set.add(temp);
                result.add(temp);
            }
            return;
        }

        for(int i=0; i<nums.length; i++){
            swap(nums, curr, i);
            findPermute(nums, result, curr+1, set);
            swap(nums, curr, i);
        }
    }

    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}