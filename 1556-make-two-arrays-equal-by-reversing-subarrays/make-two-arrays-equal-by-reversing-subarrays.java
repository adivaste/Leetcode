class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(arr);
        Arrays.sort(target);
        for(int i=0; i<arr.length; i++){
            if (arr[i] != target[i]) return false;
        }
        return true;
    }
}

/*
# Solution :

- Traverse entire array
- For each element in array
    - Check is at ccorect pos.
    - Not : Find that element and reverse from that location

[1,2,3,4]  [2,4,1,3]
           [1,4,2,3]
           [1,2,4,3]           

reverse(currIdx, elementIdx) 


*/

