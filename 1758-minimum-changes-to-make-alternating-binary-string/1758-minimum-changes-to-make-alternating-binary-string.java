class Solution {
    public int minOperations(String s) {
        int changes = 0;
        for(int i=0;i<s.length();i++){
            if(i%2 == 0){
                if(s.charAt(i) != '0'){
                    changes++;
                }
            }else{
                if(s.charAt(i) != '1'){
                    changes++;
                }
            }
        }
        int otherPattern = s.length() - changes;
        return Math.min(changes,otherPattern);
    }
}