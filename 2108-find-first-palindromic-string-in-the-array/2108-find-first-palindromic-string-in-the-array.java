class Solution {
    public String firstPalindrome(String[] words) {
        
        for(String word:words){
            int idx=0;
            int n = word.length()-1;
            while(idx < n && word.charAt(idx) == word.charAt(n)){
                idx++;
                n--;
            }
            if(idx >= n){
                return word;         
            }
        }
    return "";
    }
}