class Solution {
    public int minMoves(int[] nums) {
        int ans = 0;
        int max=Integer.MIN_VALUE;
        for(int n:nums){
            max = Math.max(max,n);
        }
        for(int n:nums){
            ans+= max-n;
        }
    return ans;
    }
}