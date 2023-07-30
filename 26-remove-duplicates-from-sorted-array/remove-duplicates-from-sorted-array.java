class Solution {
    public int removeDuplicates(int[] nums) {
        // To count the number of unique elements
        int unique = 1;

        // Left and right are pointers, if prev and curr element are unique
        // then move the pointers forward, increment unique and assign the left to right
        // Whenever two elements are equal then if condition will not follow, and as per loop
        // only right pointer move forwards, in search of unique element, and left pointer was 
        // on duplicate element which we have to replace, at next time we will find the unique 
        // element and we will replace it.
        for (int left=1, right=1;  right<nums.length; right++){
          if (nums[right-1] != nums[right]){
            unique++;
            nums[left] = nums[right];
            left++;
          }
        }

        return unique;
    }
}

