class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int mini=nums[0];
        int maxi=nums[0];
        int sum=0;
        for(int i=0;i<nums.length-1;i+=2){
            mini=Math.min(nums[i],nums[i+1]);
            sum+=mini;
        }
        return sum;
    }
}