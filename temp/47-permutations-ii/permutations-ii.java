class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        boolean[] checks = new boolean[nums.length];

        findPermute(nums, new ArrayList<Integer>(), result, checks);
        Set<List<Integer>> set = new HashSet<List<Integer>>();
        for(List<Integer> item : result){
            set.add(item);
        }

        List<List<Integer>> finalResult = new ArrayList<List<Integer>>();
        for(List<Integer> item : set){
            finalResult.add(item);
        }
        return finalResult;
    }

    public void findPermute(int[] nums, List<Integer> answer, List<List<Integer>> result, boolean[] checks){
        if (answer.size() == nums.length){
            List<Integer> temp = new ArrayList<>(answer);
            result.add(temp);
            return;
        }

        for(int i=0; i<nums.length; i++){
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