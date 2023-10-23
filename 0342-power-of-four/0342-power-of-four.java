class Solution {
    public boolean isPowerOfFour(int n) {
        int power = 0;
        double val = Math.pow(4, power);

        while(val <= n){
            if (val == n) return true;
            power++;
            val = Math.pow(4, power);
        }

        return false;
    }
}