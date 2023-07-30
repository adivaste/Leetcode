// Approach : Add 1 to last digits and store the carry. Now if carry is 1 then add it to next digits for each digits, at last still carry is 1 then create new array and add first element as 1, and copy other elements.

class Solution {
    public int[] plusOne(int[] digits) {

        for(int i=digits.length-1; i>=0; i--){
            if (digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}