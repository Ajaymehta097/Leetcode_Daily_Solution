class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] ans = sentence.split(" ");
        
        if(ans[0].charAt(0) != ans[ans.length-1].charAt(ans[ans.length-1].length()-1)){
            return false;
        }

        for(int i=0; i<ans.length-1;i++){
            char last = ans[i].charAt(ans[i].length()-1);
            char first = ans[i+1].charAt(0);

            if(last != first){
                return false; 
            }
        }
    return true;
    }
}