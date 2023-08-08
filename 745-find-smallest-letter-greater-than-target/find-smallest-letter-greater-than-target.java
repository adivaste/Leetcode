class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char result=letters[0];
        int start=0;
        int end=letters.length-1;

        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(letters[mid]==target){
                start=mid+1;
            }
            else if(target>letters[mid]){
                start=mid+1;
            }
            else{
                result=letters[mid];
                end=mid-1;
            }
        }
        return result;
    }
}