class Solution {
    public int maximumValue(String[] strs) {
        int length1 = 0;
        int length2 = 0;

        for(String str:strs){
            if(str.matches("[0-9]+")){
                int n = Integer.parseInt(str);
                length1 = Math.max(length1, n);
            }
            else {
                length2 = Math.max(length2, str.length());
            }
        }
    return Math.max(length1,length2);
    }
}