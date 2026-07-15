import java.math.BigInteger;
class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumOdd, sumEven ;
        sumOdd = n * n;
        sumEven = n * (n+1);
        BigInteger num1 = BigInteger.valueOf(sumOdd);
        BigInteger num2 = BigInteger.valueOf(sumEven);

        BigInteger gcdResult = num1.gcd(num2);
        return gcdResult.intValue();
    }
}