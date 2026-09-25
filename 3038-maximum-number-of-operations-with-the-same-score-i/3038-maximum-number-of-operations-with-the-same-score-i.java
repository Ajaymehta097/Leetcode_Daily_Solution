class Solution {
    public int maxOperations(int[] nums) {
        int target = nums[0]+nums[1];
        int count = 1;
        int i=2;
        while(i<nums.length-1){
            if(target == nums[i] + nums[i+1]){
                count++;
            }else{
                break;
            }
        i += 2;
        }
    return count;
    }
}