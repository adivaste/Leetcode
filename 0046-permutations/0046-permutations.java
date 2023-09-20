class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        findPermute(nums, answer, 0);
        return answer;
    }

    public void swap(int i, int j, int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void findPermute(int[] nums, List<List<Integer>> answer, int index){

        // Base case
        if (index == nums.length){
            List<Integer> output = new ArrayList<Integer>();
            for(int i=0; i<nums.length; i++){
                output.add(nums[i]);
            }
            answer.add(output);
            return;
        }

        for(int i=index; i<nums.length; i++){
            swap(index, i, nums);
            findPermute(nums, answer, index+1);
            swap(index, i, nums);
        }
    }

}