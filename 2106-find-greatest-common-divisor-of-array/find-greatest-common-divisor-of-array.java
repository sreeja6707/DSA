class Solution {
    public int findGCD(int[] nums) {
        int maxi=Integer.MIN_VALUE;
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>maxi){
                maxi=nums[i];
            }
            if(nums[i]<mini){
                mini=nums[i];
            }
        }
        while(mini!=0){
            int temp=mini;
            mini=maxi%mini;
            maxi=temp;
        }
        return maxi;
    }
}