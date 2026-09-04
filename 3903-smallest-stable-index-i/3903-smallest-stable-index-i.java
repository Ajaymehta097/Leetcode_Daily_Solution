class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            int leftMax = nums[0];
            for(int j=0;j<=i;j++){
                leftMax = Math.max(leftMax,nums[j]);
            }
            int rightMin = nums[i];
            for(int j=i;j<n;j++){
                rightMin = Math.min(rightMin,nums[j]);
            }
            int score = leftMax - rightMin;
            if(score <= k){
                return i;
            }
        }
    return -1;
    }
}