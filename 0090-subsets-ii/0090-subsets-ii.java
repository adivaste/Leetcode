class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> answer = new HashSet<List<Integer>>();
        findSubsetsWithDup(nums, answer, new ArrayList<Integer>(), 0);
        List<List<Integer>> finalAnswer = new ArrayList<>();
        for (List<Integer> item : answer){
            finalAnswer.add(item);
        }
        return finalAnswer;
    }

    public void findSubsetsWithDup(int[] arr, Set<List<Integer>> answer, List<Integer> output, int curr){
        // Base case
        if (curr == arr.length){
            answer.add(new ArrayList<>(output));
            return;
        }

        // Add
        output.add(arr[curr]);
        findSubsetsWithDup(arr,answer, output, curr+1);
        output.remove(output.size() - 1);
        findSubsetsWithDup(arr,answer, output, curr+1);
    }
}