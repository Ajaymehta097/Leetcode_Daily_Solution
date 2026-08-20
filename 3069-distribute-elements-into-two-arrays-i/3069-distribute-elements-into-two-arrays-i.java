class Solution {
    public int[] resultArray(int[] nums) {
        int[] arr1 = new int[nums.length];
        int[] arr2 = new int[nums.length];
        int index1 = 0;
        int index2 = 0;
        arr1[index1] = nums[0];
        index1++;
        arr2[index2] = nums[1];
        index2++;
        for(int i=2;i<nums.length;i++){
            if(arr1[index1-1] > arr2[index2 -1]){
                arr1[index1] = nums[i];
                index1++;
            }
            else{
                arr2[index2] = nums[i];
                index2++;
            }
        }
        int[] ans = new int[nums.length];
        int k=0;
        for(int i=0;i<index1;i++){
            ans[k] = arr1[i];
            k++;
        }
        for(int i=0;i<index2;i++){
            ans[k] = arr2[i];
            k++;
        }
    return ans;
    }
}