class Solution {

    // Answer to store
    List<List<Integer>> answer = new LinkedList<List<Integer>>();

    public void twoSum(int[] nums, int target, int i, int j){
        while(i < j){
            int result = nums[i] + nums[j];

            if (result == target){
                // Also have to remove duplicates
                
                while(i < j && nums[i] == nums[i+1]) i++;
                while(i < j && nums[j] == nums[j-1]) j--;

                LinkedList<Integer> temp = new LinkedList<>();
                temp.add(-target);
                temp.add(nums[i]);
                temp.add(nums[j]);
                answer.add(temp);
                System.out.println(temp);

                i++;
                j--;
            }
            else if (result  < target) i++;
            else j--;
        }
    }
    public List<List<Integer>> threeSum(int[] nums) {

        // Size
        int size = nums.length;

        // Base case
        if (size < 3) return new LinkedList<List<Integer>>();

        // Step 1 : Sort the array
        Arrays.sort(nums);

        // Step 2 : 
        for(int i=0; i<size-2; i++){
            if (i > 0 && nums[i] == nums[i-1]){
                continue;
            }

            int n1 = nums[i];
            int target = -n1;

            // It will find n2 and n3 
            twoSum(nums, target, i+1, size-1);

        }
    return answer;
    }
}