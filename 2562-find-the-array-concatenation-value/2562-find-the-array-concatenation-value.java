class Solution {
    public long findTheArrayConcVal(int[] nums) {
        int i=0;
        int j=nums.length-1;
        long sum = 0;
        while(i<j){
            String a = String.valueOf(nums[i]) + String.valueOf(nums[j]);
            sum += Integer.parseInt(a);
            i++;
            j--;
        }
        if(i==j){
            sum += nums[i];
        }
    return sum;
    }
}