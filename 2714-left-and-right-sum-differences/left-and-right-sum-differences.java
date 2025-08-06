class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int lS[]=new int[n];
        int rS[]=new int[n];
        int res[]=new int[n];
        lS[0]=0;
        for(int i=1;i<n;i++){
            lS[i]=lS[i-1]+nums[i-1];
        }
        rS[n-1]=0;
        for(int i=n-2;i>=0;i--){
            rS[i]=rS[i+1]+nums[i+1];
        }
        for(int i=0;i<n;i++){
            res[i]=Math.abs(lS[i]-rS[i]);
        }
        return res;
        
    }
}