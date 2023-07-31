class Solution {
    public int[] leftRightDifference(int[] nums) {
        
        // :: A1 : Brutforce 
        int size = nums.length;
        int[] answer = new int[size];
        int totalSum = 0;
        for(int num : nums){
            totalSum += num;
        }

        int leftSum = 0;
        for(int i=0; i<size; i++){
            System.out.println("Left Sum : " + leftSum);
            System.out.println("Total Sum : " + totalSum);
            System.out.println("Answer : " + (totalSum - (nums[i] + leftSum)));
            int ss = totalSum - (nums[i] + 2*leftSum);
            answer[i] = Math.abs(ss);
            leftSum = leftSum + nums[i];
            System.out.println("Left sum after : "+leftSum);
        }
        return answer;
    }
}