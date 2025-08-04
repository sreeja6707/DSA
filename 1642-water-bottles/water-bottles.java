class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int numB=numBottles;
        int empty=numBottles;
        while(empty>=numExchange){
            int full=empty/numExchange;
            numB+=full;
            empty=empty%numExchange+full;
        }
        return numB;
    }
}