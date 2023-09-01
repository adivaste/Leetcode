class Solution {
 
    public int[] countBits(int n) {
        int[] answer = new int[n+1];
        answer[0] = 0;

        for(int i=1; i<=n; i++){
            if (i%2 == 1) answer[i] = answer[i/2] + 1;
            else answer[i] = answer[i/2];
        }

        return answer;
    }
}