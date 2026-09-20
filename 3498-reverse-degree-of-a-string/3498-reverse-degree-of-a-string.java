class Solution {
    public int reverseDegree(String s) {
        int result = 0;
        for(int i=0;i<s.length();i++){
            int value = 'z' - s.charAt(i)+1;
            result += (i+1) * value;
        }
    return result; 
    }
}