class Solution {
    public int minimumSum(int num) {
        int d[]=new int[4];
        for(int i=0;i<4;i++){
            d[i]=num%10;
            num/=10;
        }
        Arrays.sort(d);
        int new1=d[0]*10+d[2];
        int new2=d[1]*10+d[3];
        return new1+new2;
    }
}