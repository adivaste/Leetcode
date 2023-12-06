class Solution {
    public int totalMoney(int n) {
        int prevMonday = 1;
        int currMonday = 1;
        int dayNo = 0;

        int totalMoney = 0;

        for(int i=1; i<=n; i++){
            totalMoney += currMonday + dayNo;
            if(++dayNo > 6){
                dayNo = 0;
                prevMonday = currMonday;
                currMonday = prevMonday + 1;
            }
        }

        return totalMoney;
    }
}