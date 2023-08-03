class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int size = arr.length;

        int sum = 0;
        for(int i=0; i<size; i++){
            int currSum = 0;
            for(int j=i; j<size; j++){
                currSum += arr[j];
                if ((j-i)%2 == 0){
                    sum += currSum;
                }
            }
        }

        return sum;
    }
}