class Solution {
    public boolean checkZeroOnes(String s) {
       int one = 0;
       int zero = 0;

       int maxOne = 0;
       int maxZero = 0;

       for(int i=0;i<s.length();i++){
            if(s.charAt(i)== '1'){
                one++;
                zero = 0;
                maxOne = Math.max(maxOne,one);
            }else{
                zero++;
                one = 0;
                maxZero = Math.max(maxZero,zero);
            }
       }
    return maxOne > maxZero;
    }
}