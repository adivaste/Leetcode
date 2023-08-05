class Solution {
    public int numberOfTimesArraySorted(int[] arr){
        // For array find index of minimum element that answer
        int size = arr.length;
        int left = 0;
        int right = size - 1;

        int minIndex = -1;

        if (size == 1) return 0;

        while(left <= right){
            int mid = left + (right-left)/2;
            int prev = (mid+1)%size;
            int next = (mid-1+size)%size;

            if (arr[mid] < arr[prev] && arr[next] > arr[mid]){
                 minIndex = mid;
                 break;
            }
            else if (arr[mid] < arr[right]) right = mid - 1;
            else left = mid + 1;
        }

        return minIndex;
    }

    public int binarySearch(int[] arr, int left, int right, int target){
        if (left <= right) {
            int mid = left + (right-left)/2;

            if (arr[mid] == target) return mid;
            else if (arr[mid] > target) return binarySearch(arr, left, mid-1, target);
            else return binarySearch(arr, mid+1, right, target);
        }
        return -1;
    }

    public int search(int[] arr, int target) {
        int minIndex = numberOfTimesArraySorted(arr);
        System.out.println(minIndex);
        int index1 = binarySearch(arr, 0, minIndex-1, target);
        int index2 = binarySearch(arr, minIndex, arr.length-1, target);

        if (index1 == -1) return index2;
        return index1;
    }
}