class Solution {
    public int countVowelStrings(int n) {
        return c(n+4,4);
    }
    public int c(int n,int k){
        long res=1;
        for(int i=1;i<=k;i++){
            res=res*(n+1-i)/i;
        }
        return (int)res;
    }
}