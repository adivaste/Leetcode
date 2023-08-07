class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        set.add(n);
        int sos = sumOfSquares(n);

        while(!set.contains(sos)){
            set.add(sos);
            sos = sumOfSquares(sos);
        }

        return sos == 1;
    }

    public int sumOfSquares(int num){
        int sum = 0;
        while(num != 0){
            int lastDigit = num%10;
            sum += lastDigit*lastDigit;
            num /= 10;
        }
        return sum;
    }
}