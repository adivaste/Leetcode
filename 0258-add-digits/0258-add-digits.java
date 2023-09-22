class Solution {
    public int addDigits(int num) {
        int tempNum = num;

        while(tempNum >= 10){
            tempNum = sum(tempNum);
        }
        return tempNum;
    }

    public int sum(int num){
        int sum = 0;
        while(num != 0){
            sum += num%10;
            num = num/10;
        }
        return sum;
    }
}