class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        boolean[] check = new boolean[nums.length];

        findPermute(nums, answer, new ArrayList<Integer>(), check);
        return answer;
    }

    public void findPermute(int[] nums, List<List<Integer>> answer, ArrayList<Integer> output,  boolean[] check){
        // Base case
        if (output.size() == nums.length){
            answer.add(new ArrayList<Integer>(output));
            return;
        }

        for(int i=0; i<check.length; i++){
            if (!check[i]){
                check[i] = true;
                output.add(nums[i]);
                findPermute(nums, answer, output, check);
                check[i] = false;
                output.remove(output.size()-1);
            }
        }
    }

}