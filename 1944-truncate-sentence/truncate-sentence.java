class Solution {
    public String truncateSentence(String s, int k) {
        
        int right = 0;
        while(k != 0){
            if (right == s.length() || s.charAt(right) == ' ' ){
                k--;
            }
            right++;
        }

        return s.substring(0, right-1);
    }
}