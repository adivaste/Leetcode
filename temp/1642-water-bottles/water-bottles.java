class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        
        int maxBottleCanDrink = numBottles;

        while(numBottles/numExchange >= 1){
            int newFullBottles = numBottles/numExchange;
            maxBottleCanDrink += newFullBottles;
            numBottles = numBottles%numExchange + newFullBottles;
        }

        return maxBottleCanDrink;
    }
}