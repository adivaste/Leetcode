class Solution {
    public int[] leftRightDifference(int[] nums) {
        
        // :: A1 : Brutforce 
        int size = nums.length;
        int[] answer = new int[size];

        for(int i=0; i<size; i++){

            int leftSum = 0;
            for(int j=0; j<i; j++){
                leftSum += nums[j];
            }

            int rightSum = 0;
            for(int k=i+1; k<size; k++){
                rightSum += nums[k];
            }

            answer[i] = Math.abs(leftSum-rightSum);
        }

        return answer;

    }
}