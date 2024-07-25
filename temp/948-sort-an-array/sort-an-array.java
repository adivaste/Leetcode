class Solution {
    public int[] sortArray(int[] nums) {
        
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();

        for(int num : nums){
            queue.add(num);
        }

        int index = 0;
        while(!queue.isEmpty()){
            nums[index++] = queue.poll();
        }

        return nums;
    }
}