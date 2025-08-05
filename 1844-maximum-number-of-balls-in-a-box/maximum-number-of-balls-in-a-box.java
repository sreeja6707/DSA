class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        int c[]=new int[46];
        int MB=0;
        for(int i=lowLimit;i<=highLimit;i++){
            int sum=DSum(i);
            c[sum]++;
            MB=Math.max(MB,c[sum]);
        }
        return MB;
    }
    public int DSum(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
}