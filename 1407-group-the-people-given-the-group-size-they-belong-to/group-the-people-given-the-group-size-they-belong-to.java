class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        int n=groupSizes.length;
        List<List<Integer>>g=new ArrayList<>();
        List<Integer>[] b=new ArrayList[n+1];
        for(int i=0;i<n;i++){
            int s=groupSizes[i];

            if(b[s]==null){
                b[s]=new ArrayList<>();
            }
            b[s].add(i);
            if(b[s].size()==s){
                g.add(new ArrayList<>(b[s]));
                b[s].clear();
            }
        }
        return g;

    }
}