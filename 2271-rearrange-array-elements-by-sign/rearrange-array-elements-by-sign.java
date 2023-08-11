class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] answer = new int[nums.length];
        int positiveIndex = 0;
        int negativeIndex = 1;

        for(int num: nums){
            if (num < 0){
                answer[negativeIndex] = num;
                negativeIndex += 2;
            }
            else{
                answer[positiveIndex] = num;
                positiveIndex += 2;
            }
        }

        return answer;
    }
}