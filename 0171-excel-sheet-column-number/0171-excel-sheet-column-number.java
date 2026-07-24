class Solution {
    public int titleToNumber(String columnTitle) {
        int sum=0,p=0;
        int len = columnTitle.length();
        for(int i=len-1;i>=0;i--){
            int temp = columnTitle.charAt(i)-64;
            sum += Math.pow(26,p++)*temp;
        }
    return sum;
    }
}