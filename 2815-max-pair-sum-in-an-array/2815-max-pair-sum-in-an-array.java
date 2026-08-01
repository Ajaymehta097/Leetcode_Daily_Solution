class Solution {
    public int maxSum(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans = -1;
        for(int num:nums){
            int temp = num;
            int max = 0;
            while(temp>0){
                int digit = temp % 10;
                max = Math.max(max,digit);
                temp /= 10;
            }
            if(map.containsKey(max)){
                ans = Math.max(ans,map.get(max) + num);
            }
            map.put(max,Math.max(map.getOrDefault(max,0),num));
        }
    return ans;
    }
}