class Solution {
    public int differenceOfSum(int[] nums) {
        
        int totalDigitSum = 0;
        for(int num: nums){
            totalDigitSum += getDigitSum(num);
        }

        int numberSum = 0;
        for(int num : nums){
            numberSum += num;
        }

        return Math.abs(totalDigitSum - numberSum);
    }

    public int getDigitSum(int number){
        int sum = 0;
        while(number > 0){
            int lastDigit = number%10;
            sum += lastDigit;
            number = number/10;
        }
        return sum;
    }
}