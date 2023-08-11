class Solution {
    public boolean canJump(int[] nums) {



        int boundry = 0;
        int size = nums.length;

        for(int i=0; i<size; i++){

            if (i <= boundry){
                if (i+ nums[i] >= size-1) return true;
                boundry = Math.max(boundry, i+ nums[i]);
            }
            else return false;
        }

        return false;
    }
}

/*
nums[]
first index = 0


boundry = 2;
size = 5;

Idx  : 0 1 2 3 4 
Nums : 1 0 6 1 4
                   

# Solution
1. Traverse one by one
2. Check within boundry <= not,
    if not -> false, 
    else 
        if currIndex + currIndex[value] = size -1  -> yes ::  return true
        boundry = max(currIndex + value, boundry)
*/