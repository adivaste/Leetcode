class Solution {
    public int[] decompressRLElist(int[] nums) {
        
        int size = nums.length;
        ArrayList<Integer> temp = new ArrayList<>();

        for(int i=0; i<size; i=i+2){
            for(int j=0; j<nums[i]; j++){
                temp.add(nums[i+1]);
            }
        }

        int[] answer = new int[temp.size()];
        for(int i=0; i<temp.size(); i++){
            answer[i] = temp.get(i);
        }

        return answer;
    }
}