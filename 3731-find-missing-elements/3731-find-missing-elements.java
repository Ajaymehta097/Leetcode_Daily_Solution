class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        int min=nums[0];
        int max = nums[nums.length-1];
        for(int num:nums){
            set.add(num);
        }
        for(int i=min;i<max;i++){
            if(!set.contains(i)){
                ans.add(i);
            }
        }
    return ans;    
    }
}