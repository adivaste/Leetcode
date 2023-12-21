class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {

        // Sort the array
        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<List<Integer>>();
        boolean[] checks = new boolean[nums.length];

        findPermute(nums, new ArrayList<Integer>(), result, checks);
        return result;
    }

    public void findPermute(int[] nums, List<Integer> answer, List<List<Integer>> result, boolean[] checks){
        if (answer.size() == nums.length){
            List<Integer> temp = new ArrayList<>(answer);
            result.add(temp);
            return;
        }

        int size = nums.length;
        for(int i=0; i<size; i++){
            if (checks[i] || (i > 0 && nums[i] == nums[i-1] && !checks[i-1])) {
                continue;
            }
            if (!checks[i]){
                answer.add(nums[i]);
                checks[i] = true;
                findPermute(nums, answer, result, checks);
                checks[i] = false;
                answer.remove(answer.size()-1);
            }
        }
    }
}