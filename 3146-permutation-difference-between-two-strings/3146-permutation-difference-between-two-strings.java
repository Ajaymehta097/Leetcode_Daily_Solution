class Solution {
    public int findPermutationDifference(String s, String t) {
        int sum=0;
        for(int i=0;i<t.length();i++){
            int ch = t.charAt(i);
        
        int indexT=i;
        int indexS = s.indexOf(ch);
        sum+= Math.abs(indexS-indexT); 
        }
    return sum;
    }
}