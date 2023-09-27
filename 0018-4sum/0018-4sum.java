class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        Arrays.sort(nums);
        int size = nums.length;
        Set<List<Integer>> answer = new HashSet<>();

        for(int i=0; i<size; i++){
            for(int j=i+1; j<size; j++){
                int k = j+1;
                int l = size-1;

                while(k < l){
                        long sum = (long)nums[i] + (long)nums[j] + (long)nums[k] + (long)nums[l];
                        if (sum == target){
                            List<Integer> local = new ArrayList<Integer>();
                            Collections.addAll(local,nums[i], nums[j], nums[k], nums[l]);
                            Collections.sort(local);
                            answer.add(local);

                            k++;
                            l--;
                        }
                        else if (sum < target){
                            k++;
                        }
                        else l--;
                }
            }
        }

        List<List<Integer>> result = new ArrayList<>();
        for(List<Integer> l : answer){
            result.add(l);
        }
        return result;
    }
}