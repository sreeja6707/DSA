class Solution {
    public int splitNum(int num) {
        int d[]=new int[10];
        int c=0;
        while(num>0){
            d[c++]=num%10;
            num/=10;
        }
        Arrays.sort(d,0,c);
        int oddS=0;
        int evenS=0;
        for(int i=0;i<c;i++){
            if(i%2!=0){
                oddS=oddS*10+d[i];
            }
            else{
                evenS=evenS*10+d[i];
            }
        }
        return oddS+evenS;
    }
}