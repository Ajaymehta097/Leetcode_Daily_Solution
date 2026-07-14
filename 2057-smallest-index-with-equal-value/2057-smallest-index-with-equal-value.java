class Solution {
    public int smallestEqual(int[] nums) {
        int mod;
        for(int i=0;i<nums.length;i++){
            mod = i%10;
            if(mod == nums[i]){
                return i;
            }
        }
        return -1;
    }
}