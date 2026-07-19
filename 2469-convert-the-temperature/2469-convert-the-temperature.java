class Solution {
    public double[] convertTemperature(double celsius) {
        double[] ans = new double[2];
        double Kelvin = celsius + 273.15;
        double Fahrenhit = celsius * 1.80 + 32.00;
        ans[0] = Kelvin;
        ans[1] = Fahrenhit; 
        return ans;
    }
}