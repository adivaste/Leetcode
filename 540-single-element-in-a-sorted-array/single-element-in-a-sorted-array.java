class Solution {
    public int singleNonDuplicate(int[] arr) {
        int size = arr.length;
        if (size == 1) return arr[0];

        int low = 0;
        int high = size-1;

        while(low <= high){
            int mid = low + (high-low)/2;
            int prev = (mid-1+size)%size;
            int next = (mid+1)%size;

            if (arr[mid] == arr[prev] || arr[mid] == arr[next]){
                int requireIndex = (arr[mid] == arr[prev]) ? prev : next;
                int smallerIndex = Math.min(mid, requireIndex);

                if (smallerIndex%2 == 0) low = mid+1;
                else high = mid-1;
            }
            else{
                return arr[mid];
            }
        }
        return -1;
    }
}