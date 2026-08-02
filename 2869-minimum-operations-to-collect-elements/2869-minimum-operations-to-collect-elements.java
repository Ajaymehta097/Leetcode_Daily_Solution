class Solution {
    public int minOperations(List<Integer> nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        int count=0;
        int len = nums.size();
        for(int i=1;i<=k;i++){
            set.add(i);
        }
        for(int i=len-1;i>=0;i--){
            count++;
            if(set.contains(nums.get(i))){
                set.remove(nums.get(i));
            }
            if(set.isEmpty()){
                return count;
            }
        }
    return count;   
    }
}