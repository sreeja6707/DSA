class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean>res=new ArrayList<Boolean>();
        int maxC=candies[0];
        for(int i=0;i<candies.length;i++){
            if(candies[i]>maxC){
                maxC=candies[i];
            }
        } 
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=maxC){
                res.add(true);
            }
            else{
                res.add(false);
            }
        }
        return res;
        
    }
}