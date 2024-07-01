class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        if (arr.length < 3) return false;
        
        boolean containsConsecutiveOdds = false;
        int i = 0;
        int j = 1;

        for(int k=2; k<arr.length; k++){
            if (arr[i]%2 == 1 && arr[j]%2 == 1 && arr[k]%2 == 1){
                containsConsecutiveOdds = true;
                return containsConsecutiveOdds;
            }
            j++;
            i++;
        }
        return containsConsecutiveOdds;
    }
}