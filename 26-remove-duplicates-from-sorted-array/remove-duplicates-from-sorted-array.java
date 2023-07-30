class Solution {
    public int removeDuplicates(int[] arr) {
        // To count the number of unique elements
        int unique = 1;

        // Left and right are pointers, if prev and curr element are unique
        // then move the pointers forward, increment unique and assign the left to right
        // Whenever two elements are equal then if condition will not follow, and as per loop
        // only right pointer move forwards, in search of unique element, and left pointer was 
        // on duplicate element which we have to replace, at next time we will find the unique 
        // element and we will replace it.
        for(int left=0, right=1; right<arr.length; right++){
          if (arr[right] != arr[left]){
             arr[left+1] = arr[right];
             left++;
             unique++;
          }
        }

        return unique;
    }
}

