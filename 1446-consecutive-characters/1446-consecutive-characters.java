class Solution {
    public int maxPower(String s) {
        int count = 1;
        int maxcount = 1;
        int len=s.length();
        for(int i=0;i<len-1;i++){            
            if(s.charAt(i) == s.charAt(i+1))
                count++;
            else{
                count = 1;
            }
            maxcount = Math.max(maxcount,count);          
        }
    return maxcount;
    }
}