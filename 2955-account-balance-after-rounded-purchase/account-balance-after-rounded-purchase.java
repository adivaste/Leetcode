class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {

        if (purchaseAmount <= 4) return 100;
        
        int countOfMultiples = purchaseAmount/10;
        purchaseAmount = purchaseAmount%10;
        
        // System.out.println(countOfMultiples);
        
        if (purchaseAmount >= 5) countOfMultiples++;
        
        int totalAmount = countOfMultiples*10;
        int balance = 100 - totalAmount;
        return balance;
        
    }
}