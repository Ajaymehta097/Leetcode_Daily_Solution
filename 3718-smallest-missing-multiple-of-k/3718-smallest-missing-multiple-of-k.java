class Solution {
    public int missingMultiple(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();
        int a=k;
        for(int i=0;i<nums.length;i++){
            if(nums[i] % a == 0){
                list.add(nums[i]);
            }
        }
        while(list.contains(a)) {
            a = a + k;
        }
    return a;
    }
}