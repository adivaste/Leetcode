class Solution {
    public List<List<Integer>> permute(int[] nums) {
        int size = nums.length;
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> answer = new ArrayList<Integer>();
        boolean[] checks = new boolean[size];

        findPermute(nums, result, answer, checks);

        return result;
    }

    public void findPermute(int[] nums, List<List<Integer>> result, List<Integer> answer, boolean[] checks){
        if (answer.size() == nums.length){
            List<Integer> temp = new ArrayList<>(answer);
            result.add(temp);
            return;
        }

        for(int i=0; i<nums.length; i++){
            if (!checks[i]){
                answer.add(nums[i]);
                checks[i] = true;
                findPermute(nums, result, answer, checks);
                checks[i] = false;
                answer.remove(answer.size()-1);
            }
        }
    }

}