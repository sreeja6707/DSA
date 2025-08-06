class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        char ch[]=allowed.toCharArray();
        int cnt=0;
        for(int i=0;i<words.length;i++){
            char c[]=words[i].toCharArray();
            boolean consistent=true;
            for(int j=0;j<c.length;j++){
            boolean found=false;
            for(int k=0;k<ch.length;k++){
            if(c[j]==ch[k]){
                found=true;
                break;
            }
        }
        if(!found){
            consistent=false;
            break;
        }
    }
    if(consistent){
        cnt++;
    }
}
    return cnt;
    }
}