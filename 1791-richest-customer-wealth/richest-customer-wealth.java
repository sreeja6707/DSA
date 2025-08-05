class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxW=0;
        for(int i=0;i<accounts.length;i++){
        int rS=0;
        for(int j=0;j<accounts[i].length;j++){
            rS+=accounts[i][j];
        }
        maxW=Math.max(maxW,rS);
        }
        return maxW;
    }
}