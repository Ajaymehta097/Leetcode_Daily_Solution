class Solution {
    public int maxProduct(int n) {
        String s = String.valueOf(n);
        int product = 0;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
            int a = s.charAt(i)-'0';
            int b = s.charAt(j)-'0';
            product = Math.max(product,a*b);
            }
        }
    return product;
    }
}