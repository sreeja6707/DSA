class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer>res=new ArrayList<>();
        int n=num.length;
        int i=n-1;
        while(i>=0 || k>0){
            if(i>=0){
                k+=num[i];
                i--;
            }
            res.add(k%10);
            k/=10;
        }
        Collections.reverse(res);
        return res;
    }
}