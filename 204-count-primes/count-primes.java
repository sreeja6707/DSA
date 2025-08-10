class Solution {
    public int countPrimes(int n) {
        int c=0;
        if(n<=2){
            return 0;
        }
        boolean prime[]=new boolean[n];
        Arrays.fill(prime,true);
        prime[0]=false;
        prime[1]=false;
        for(int j=2;j*j<n;j++){
            if(prime[j]){
                for(int i=j*j;i<n;i+=j){
                prime[i]=false;
            }
        }
    }
    for(boolean p:prime){
            if(p){
            c++;
            }
        }
        return c;
    }
}