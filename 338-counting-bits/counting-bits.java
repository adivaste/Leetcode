class Solution {

    public int getOnesCount(int n){
        int count = 0;
        while(n > 0){
            count += n & 1;
            n >>= 1;
        }
        return count;
    }
    public int[] countBits(int n) {
        int[] answer = new int[n+1];
        for(int i=0; i<=n; i++){
            answer[i] = getOnesCount(i);
        }

        return answer;
    }
}