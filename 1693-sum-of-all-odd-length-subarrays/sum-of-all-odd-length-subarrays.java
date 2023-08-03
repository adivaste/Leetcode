class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int size = arr.length;

        int sum = 0;
        for(int i=0; i<size; i++){
            for(int j=i; j<size; j++){
                if ((j-i)%2 == 0){
                    for(int k=i; k<=j; k++){
                        sum += arr[k];
                    }
                }
            }
        }

        return sum;
    }
}