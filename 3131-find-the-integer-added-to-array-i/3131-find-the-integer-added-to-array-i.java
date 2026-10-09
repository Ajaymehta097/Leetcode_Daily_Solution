class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        int maxNum1 = 0;
        int maxNum2 = 0;
        for(int i=0;i<nums1.length;i++){
            maxNum1 = Math.max(nums1[i],maxNum1);
        }
        for(int i=0;i<nums2.length;i++){
            maxNum2 = Math.max(nums2[i],maxNum2);
        }
    return maxNum2-maxNum1;
    }
}