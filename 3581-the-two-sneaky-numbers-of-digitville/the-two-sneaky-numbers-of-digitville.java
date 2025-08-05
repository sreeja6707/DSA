class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int c[]=new int[nums.length];
        List<Integer>l=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            c[nums[i]]++;
            if(c[nums[i]]==2){
                l.add(nums[i]);
            }
        }
        return new int[] {l.get(0),l.get(1)};
    }
}