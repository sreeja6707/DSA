class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer>h=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(h.contains(nums[i])){
                return true;
            }
            h.add(nums[i]);
            if(h.size()>k){
                h.remove(nums[i-k]);
            }
        }
        return false;
        /*for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j] && Math.abs(i-j)<=k){
                    return true;
                }
            }
        }
        return false;*/
    }
}