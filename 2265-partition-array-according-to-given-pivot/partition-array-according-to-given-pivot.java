class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer>l=new ArrayList<>();
        List<Integer>e=new ArrayList<>();
        List<Integer>g=new ArrayList<>();
       
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                l.add(nums[i]);
            }
            else if(nums[i]>pivot){
                g.add(nums[i]);
            }
            else{
                e.add(nums[i]);
            }
        }
         int f[]=new int[nums.length];
         int id=0;
         for(int i=0;i<l.size();i++){
            f[id++]=l.get(i);
         }
         for(int i=0;i<e.size();i++){
            f[id++]=e.get(i);
         }
         for(int i=0;i<g.size();i++){
            f[id++]=g.get(i);
         }
         return f;
    }
}