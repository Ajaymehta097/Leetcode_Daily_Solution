class Solution {
    // find Gcd function
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public long gcdSum(int[] nums) {
        // 1. step - find prefixGcd;
        int n = nums.length;
        int[] prefixGcd = new int[n];
        int mxi = nums[0];
    
        for(int i=0;i<n;i++){
            mxi = Math.max(mxi,nums[i]); // prefix maximum
            prefixGcd[i] = gcd(nums[i],mxi); // prefixGcd
        }
        //2.Step - Sort prefixGcd
        Arrays.sort(prefixGcd);

        //3.Step - Pair the smallest and largest elements: gcd(smallest,largest);
        int start = 0;
        int end = n-1;
        long sum = 0;
        
        while(start < end){
            sum += gcd(prefixGcd[start], prefixGcd[end]); // step-4 -> sum of all gcd pairs
            start++;
            end--;
        }
    return sum;
    }
}