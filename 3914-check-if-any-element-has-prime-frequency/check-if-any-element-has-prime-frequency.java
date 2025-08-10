class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        int n=nums.length;
        
        for(int i=0;i<n;i++){
            int c=0;
            for(int j=0;j<n;j++){
            if(nums[i]==nums[j]){
                c++;
            }
        }
        if(c>=2){
            boolean prime=true;
        for(int k=2;k*k<=c;k++){
            if(c%k==0){
                prime= false;
                break;
            }
        }
        if(prime) return true;
        }
        }
        return false;
    }
}