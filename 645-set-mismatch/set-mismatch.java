class Solution {
    public int[] findErrorNums(int[] arr){
        int currIdx = 0;

        while(currIdx < arr.length){
            int correctIdx = arr[currIdx] - 1;
            if ((arr[currIdx] == currIdx+1) || (arr[currIdx] == arr[correctIdx])){
                currIdx++;
            }
            else{
                swap(arr, currIdx, correctIdx);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i+1) return (new int[]{arr[i], i+1});
        }
        return new int[]{};
    }



    private static void swap(int[] arr, int currIdx, int correctIdx) {
        int temp = arr[currIdx];
        arr[currIdx] = arr[correctIdx];
        arr[correctIdx] = temp;
    }
}