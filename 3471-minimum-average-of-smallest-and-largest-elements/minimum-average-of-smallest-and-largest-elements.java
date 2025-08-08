class Solution {
    public double minimumAverage(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int l=0;
        int r=n-1;
        double avg=nums[r];
        while(l<r){
            avg=Math.min(((nums[l]+nums[r])/2D),avg);
            l++;
            r--;
        }
        
        return avg;
    }
}