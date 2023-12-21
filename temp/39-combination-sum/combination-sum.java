class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> answer = new ArrayList<List<Integer>>();
        findCombinationSum(candidates, answer, new ArrayList<Integer>(), 0, target);
        return answer;
    }

    private void findCombinationSum(int[] candidates, List<List<Integer>> answer, List<Integer> output, int curr, int target){
        if (curr == candidates.length){
            if (target == 0){
                answer.add(new ArrayList<>(output));
            }
            return;
        }

        // Insert choice
        if (target >= 0){
            output.add(candidates[curr]);
            findCombinationSum(candidates, answer, output, curr, target-candidates[curr]);
            output.remove(output.size() - 1);
        }
        findCombinationSum(candidates, answer, output, curr+1, target);
    }

}