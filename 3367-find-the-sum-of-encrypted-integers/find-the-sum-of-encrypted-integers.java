class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum=0;
        for(int n:nums){
            int maxD=0;
            int len=0;
            int t=n;
            while(t>0){
                int d=t%10;
                maxD=Math.max(maxD,d);
                t/=10;
                len++;
            }
            if(len==0){
                len=1;
            }
            int p=0;
            for(int i=0;i<len;i++){
                p=p*10+maxD;
            }
            sum+=p;
        }
        return sum;
    }
}